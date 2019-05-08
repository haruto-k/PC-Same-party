import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample1
{
   public static void main(String args[]) throws Exception
   {
      //SAX�̏���������
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //�n���h�����쐬����
      SampleHandler1 sh = new SampleHandler1();

      //������ǂݍ���
      sp.parse(new FileInputStream("Sample.xml"), sh);

   }
}

//�n���h���N���X
class SampleHandler1 extends DefaultHandler
{
   //�����̊J�n
   public void startDocument() 
   {
      System.out.println("XML�������J�n���܂����B");
   }
   
   //�����̏I��
   public void endDocument() 
   {
      System.out.println("XML�������I�����܂����B");
   }
}
