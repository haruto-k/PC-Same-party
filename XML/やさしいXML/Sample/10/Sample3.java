import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample3
{
   public static void main(String args[]) throws Exception
   {
      //SAX�̏���������
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //�n���h�����쐬����
      SampleHandler3 sh = new SampleHandler3();

      //������ǂݍ���
      sp.parse(new FileInputStream("Sample.xml"), sh);
   }
}

//�n���h���N���X
class SampleHandler3 extends DefaultHandler
{
   //�������p�ӂ���
   StringBuffer sb = new StringBuffer();
   boolean isPrint = false;

   //�����̊J�n
   public void startDocument()
  {
      sb.append
      ("<?xml version=\"1.0\" encoding=\"Shift_JIS\" ?>");
      sb.append("<cars>");
   }

   //�����̏I��
   public void endDocument()
   {
      sb.append("</cars>");
      //������������o��
      try{
         PrintWriter pw = new PrintWriter
           (new BufferedWriter
           (new FileWriter("result.xml")));
          pw.println(sb);
         pw.close();
      }catch(Exception e){} 
   }

   //�v�f�̊J�n
   public void startElement(String namespaceURI,
                            String localName,
                            String qName, 
                            Attributes attrs) 
   {
      if(qName.equals("name")){
         sb.append("<" + qName + ">");
         isPrint = true;
      }
   }

   //�v�f�̏I��
   public void endElement(String namespaceURI,
                          String localName,
                          String qName)
   {
      if(qName.equals("name")){
         sb.append("</" + qName + ">");
         isPrint = false;
      }
   }

   //�����f�[�^
   public void characters(char[] ch, int start,int length)                            
   {
      String str = new String(ch, start, length);
      if(str.trim().length() != 0 && isPrint == true){
            sb.append(str);
      }
   }
}

