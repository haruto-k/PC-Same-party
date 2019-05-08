import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample6
{
   public static void main(String args[]) throws Exception
   {
      //SAX�̏���������
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //�n���h�����쐬����
      SampleHandler6 sh = new SampleHandler6();

      //������ǂݍ���
      sp.parse(new FileInputStream("Sample.xml"), sh);
   }
}

//�n���h���N���X
class SampleHandler6 extends DefaultHandler
{
   //�������p�ӂ���
   StringBuffer sb = new StringBuffer();

   //�����̏I��
   public void endDocument()
   {
      //������������o��
      try{
         PrintWriter pw = new PrintWriter
           (new BufferedWriter
           (new FileWriter("result.html")));
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
         sb.append("<html>");
      }
      else if(qName.equals("car")){
         sb.append("<div>");
      }
      else if(qName.equals("name")){
         sb.append("<h1>");
      }
      else if(qName.equals("price")){
         sb.append("<p>");
      }
      else if(qName.equals("img")){
         sb.append("<img src=\"");
         for(int i=0; i<attrs.getLength(); i++){
            if(attrs.getQName(i).equals("file")){
               sb.append(attrs.getValue(i));
            }
         }
         sb.append("\"/>");
      }
   }

   //�v�f�̏I��
   public void endElement(String namespaceURI,
                          String localName,
                          String qName) 
   {
      if(qName.equals("cars")){
         sb.append("</html>");
      }
      else if(qName.equals("car")){
         sb.append("</div>");
      }
      else if(qName.equals("name")){
         sb.append("</h1>");
      }
      else if(qName.equals("price")){
         sb.append("</p>");
      }
   }

   //�����f�[�^
   public void characters(char[] ch, int start, int length)
   {
      String str = new String(ch, start, length);
      if(str.trim().length() != 0){
            sb.append(str);
      }
   }
}
