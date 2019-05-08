import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample2
{
   public static void main(String args[]) throws Exception
   {
      //SAX�̏���������
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //�n���h�����쐬����
      SampleHandler2 sh = new SampleHandler2();

      //������ǂݍ���
      sp.parse(new FileInputStream("Sample.xml"), sh);

   }
}

//�n���h���N���X
class SampleHandler2 extends DefaultHandler
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

   //�v�f�̊J�n
   public void startElement(String namespaceURI,
                            String localName,
                            String qName, 
                            Attributes attrs) 
   {
      System.out.println(qName + "���J�n���܂����B");
   }

   //�v�f�̏I��
   public void endElement(String namespaceURI,
                          String localName,
                          String qName) 
   {
      System.out.println(qName + "���I�����܂����B");
   }
}

