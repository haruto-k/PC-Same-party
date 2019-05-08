import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample5
{
   public static void main(String args[]) throws Exception
   {
      //SAX�̏���������
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //�n���h�����쐬����
      SampleHandler5 sh = new SampleHandler5();

      //������ǂݍ���
      sp.parse(new FileInputStream("Sample.xml"), sh);
   }
}

//�n���h���N���X
class SampleHandler5 extends DefaultHandler
{
   //�������p�ӂ���
   StringBuffer sb = new StringBuffer();

   //�����̊J�n
   public void startDocument() {
      sb.append
     ("<?xml version=\"1.0\" encoding=\"Shift_JIS\" ?>");
   }

   //�����̏I��
   public void endDocument() {
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
      if(qName.equals("cars")){
         sb.append("<�ԃ��X�g>");
      }
      else if(qName.equals("car")){
         sb.append("<��>");
      }
      else if(qName.equals("name")){
         sb.append("<�i��>");
      }
      else if(qName.equals("price")){
         sb.append("<���i>");
      }
   }

   //�v�f�̏I��
   public void endElement(String namespaceURI,
                          String localName,
                          String qName)
   {
      if(qName.equals("cars")){
         sb.append("</�ԃ��X�g>");
      }
      else if(qName.equals("car")){
         sb.append("</��>");
      }
      else if(qName.equals("name")){
         sb.append("</�i��>");
      }
      else if(qName.equals("price")){
         sb.append("</���i>");
      }
   }

   //�����f�[�^
   public void characters(char[] ch, int start, int length)                                             {
      String str = new String(ch, start, length);
      if(str.trim().length() != 0){
            sb.append(str);
      }
   }
}

