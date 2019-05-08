import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample6
{
   public static void main(String args[]) throws Exception
   {
      //SAXの準備をする
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //ハンドラを作成する
      SampleHandler6 sh = new SampleHandler6();

      //文書を読み込む
      sp.parse(new FileInputStream("Sample.xml"), sh);
   }
}

//ハンドラクラス
class SampleHandler6 extends DefaultHandler
{
   //文字列を用意する
   StringBuffer sb = new StringBuffer();

   //文書の終了
   public void endDocument()
   {
      //文字列を書き出す
      try{
         PrintWriter pw = new PrintWriter
           (new BufferedWriter
           (new FileWriter("result.html")));
          pw.println(sb);
         pw.close();
      }catch(Exception e){} 
    }

   //要素の開始
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

   //要素の終了
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

   //文字データ
   public void characters(char[] ch, int start, int length)
   {
      String str = new String(ch, start, length);
      if(str.trim().length() != 0){
            sb.append(str);
      }
   }
}
