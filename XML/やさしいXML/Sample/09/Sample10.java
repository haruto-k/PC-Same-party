import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample10
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
      Document doc
         = db.parse(new FileInputStream("Sample.xml"));

     //���[�g�v�f�𓾂�
      Element root = doc.getDocumentElement();

     //���[�g�v�f�J�n�^�O���쐬����
     sb.append("<html>");

     //���������ǂ�
     walk(root);

     //���[�g�v�f�I���^�O���쐬����
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

            if(ch.getNodeName().equals("car")){
               sb.append("<div>");
               walk(ch);
               sb.append("</div>");
            }
            else if(ch.getNodeName().equals("name")){
               sb.append("<h1>");
               walk(ch);
               sb.append("</h1>");
            }
            else if(ch.getNodeName().equals("price")){
               sb.append("<p>");
               walk(ch);
               sb.append("</p>");
            }
            else if(ch.getNodeName().equals("img")){
               sb.append("<img src=\"");
               NamedNodeMap attrlist = ch.getAttributes();
               Node attr = attrlist.getNamedItem("file");
               sb.append(attr.getNodeValue());
               sb.append("\"/>");
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
