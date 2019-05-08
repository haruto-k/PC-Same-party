import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;
import org.w3c.dom.*;

class Sample1
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

      //�����������o��
      TransformerFactory tff
         = TransformerFactory.newInstance();
      Transformer tf
         = tff.newTransformer();
      tf.setOutputProperty(OutputKeys.ENCODING, "Shift_JIS");
      tf.transform(new DOMSource(doc), new StreamResult("result.xml"));
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
               Document doc = ch.getOwnerDocument();
               Element comp = doc.createElement("company");
               Text txt = doc.createTextNode("�J�[�o���N��");
               ch.appendChild(comp);
               comp.appendChild(txt);
            }

            walk(ch);
         }
      }
   }
}
