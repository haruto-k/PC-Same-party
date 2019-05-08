import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample5
{
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

      //���������ǂ�
      walk(root);

   }

   //�m�[�h�̎q�����ǂ�
   public static void walk(Node n)
   {
      for(Node ch = n.getFirstChild();
               ch != null;
               ch = ch.getNextSibling()){

         //�v�f����������
         if(ch.getNodeType() == Node.ELEMENT_NODE){
            System.out.println(ch.getNodeName());
            walk(ch);
         }
      }
   }
}
