import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample9
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

     //XML�錾���쐬����
     sb.append("<?xml version=\"1.0\" encoding=\"Shift_JIS\" ?>");

     //���[�g�v�f�J�n�^�O���쐬����
     sb.append("<�ԃ��X�g>");

     //���������ǂ�
     walk(root);

     //���[�g�v�f�I���^�O���쐬����
     sb.append("</�ԃ��X�g>");

     //������������o��
     PrintWriter pw = new PrintWriter
       (new BufferedWriter(new FileWriter("result.xml")));
     pw.println(sb);
     pw.close();
   }

   //�w�肵���m�[�h�̎q�����ǂ�
   public static void walk(Node n)
   {
      for(Node ch = n.getFirstChild();
               ch != null;
               ch = ch.getNextSibling()){

         //�v�f����������
         if(ch.getNodeType() == Node.ELEMENT_NODE){

            if(ch.getNodeName().equals("car")){
               sb.append("<��>");
               walk(ch);
               sb.append("</��>");
            }
            else if(ch.getNodeName().equals("name")){
               sb.append("<�i��>");
               walk(ch);
               sb.append("</�i��>");
            }
            else if(ch.getNodeName().equals("price")){
               sb.append("<���i>");
               walk(ch);
               sb.append("</���i>");
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
