import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample12
{
   //�������p�ӂ���
   static StringBuffer sb = new StringBuffer();

   public static void main(String args[]) throws Exception
   {
      //DOM�̏���������
      DocumentBuilderFactory dbf
         = DocumentBuilderFactory.newInstance();
      DocumentBuilder db
         = dbf.newDocumentBuilder();

      //������ǂݍ���
      Document doc = db.parse(args[0]);

     //���[�g�v�f�𓾂�
      Element root = doc.getDocumentElement();

     //���[�g�v�f�J�n�^�O���쐬����
     sb.append("<html>");
     sb.append("<body>");               

     //���������ǂ�
     walk(root);

     //���[�g�v�f�I���^�O���쐬����
     sb.append("</body>");               
     sb.append("</html>");

     //������������o��
     PrintWriter pw = new PrintWriter
       (new BufferedWriter(new FileWriter("result.html")));
     pw.println(sb);
     pw.close();
   }

   //�m�[�h�̎q�����ǂ�
   public static void walk(Node n)
   {
      for(Node ch = n.getFirstChild();
               ch != null;
               ch = ch.getNextSibling()){

         //�v�f����������
         if(ch.getNodeType() == Node.ELEMENT_NODE){
            if(ch.getNodeName().equals("channel")){
                  walk(ch);
            }
            else if(ch.getNodeName().equals("item")){
                  walk(ch);
            }
            else if(ch.getNodeName().equals("title")){
               if(ch.getParentNode().getNodeName().equals("channel")){
                  sb.append("<center>");               
                  sb.append("<h1>");               
                  walk(ch);
                  sb.append("</h1>");               
                  sb.append("</center>");               
               }
               else{
                  sb.append("<h3>");               
                  sb.append("<a href=\"");
                  for(Node s = ch;
                           s != null;
                           s = s.getNextSibling()){
                     if(s.getNodeName().equals("link")){
                        for(Node c = s.getFirstChild();
                                 c != null;
                                 c = c.getNextSibling()){
                           if(c.getNodeType() == Node.TEXT_NODE
                              && c.getNodeValue().trim().length() != 0){
                              sb.append(c.getNodeValue());
                           }
                        }
                     }
                  }
                  sb.append("\"/>");
                  walk(ch);
                  sb.append("</a>");               
                  sb.append("</h3>");               
               }  
            }
            else if(ch.getNodeName().equals("description")){
               if(ch.getParentNode().getNodeName().equals("channel")){
                  sb.append("<center>");               
                  walk(ch);
                  sb.append("<br/><hr/>");               
                  sb.append("</center>");               
               }
               else{
                  walk(ch);
               }  
            }
         }

         //�e�L�X�g����������
         else if(ch.getNodeType() == Node.TEXT_NODE
                 && ch.getNodeValue().trim().length() != 0){
            sb.append(ch.getNodeValue());
         }
      }
   }
}
