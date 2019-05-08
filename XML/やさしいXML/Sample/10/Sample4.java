import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample4
{
   public static void main(String args[]) throws Exception
   {
      //SAX�̏���������
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //�n���h�����쐬����
      SampleHandler4 sh = new SampleHandler4();

      //������ǂݍ���
      sp.parse(new FileInputStream("Sample.xml"), sh);
   }
}

//�n���h���N���X
class SampleHandler4 extends DefaultHandler
{
   //�������p�ӂ���
   StringBuffer sb = new StringBuffer();

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
      if(qName.equals("car")){
         for(int i=0; i<attrs.getLength(); i++){
            sb.append("<" + attrs.getQName(i) + ">");
            sb.append(attrs.getValue(i));
            sb.append("</" + attrs.getQName(i) + ">");
         }
      }
   }
}
