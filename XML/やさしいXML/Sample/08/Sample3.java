import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample3
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

      //���[�g�v�f�̎q�����ǂ�
      walk(root);

   }

   //�m�[�h�̎q�����ǂ�
   public static void walk(Node n)
   {
      for(Node ch = n.getFirstChild();
               ch != null;
               ch = ch.getNextSibling()){
         System.out.println(ch.getNodeName());
      }
   }
}
