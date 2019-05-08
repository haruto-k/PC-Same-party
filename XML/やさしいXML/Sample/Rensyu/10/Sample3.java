import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample3
{
   public static void main(String args[]) throws Exception
   {
      //SAXの準備をする
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //ハンドラを作成する
      SampleHandler3 sh = new SampleHandler3();

      //文書を読み込む
      sp.parse(args[0], sh);
   }
}

//ハンドラクラス
class SampleHandler3 extends DefaultHandler
{
   //文字列を用意する
   StringBuffer sb = new StringBuffer();
   boolean isItem = false;
   boolean isItemTitle = false;
   boolean isPrint = false;
   String title = "";

   public void startDocument(){}
   public void endDocument(){
     try{
        //文字列を保存する
        PrintWriter pw = new PrintWriter
          (new BufferedWriter(new FileWriter("result.html")));
        pw.println(sb);
        pw.close();
     }catch(Exception e){}
   }
   public void startElement(String namespaceURI,
                            String localName,
                            String qName, 
                            Attributes attrs){
      if(qName.equals("rss")){
         sb.append("<html>");
         sb.append("<table border=\"1\">");
         sb.append("<th bgcolor=\"#DDDDDD\">");
         sb.append("タイトル");
         sb.append("</tr>");
         sb.append("<th bgcolor=\"#DDDDDD\">");
         sb.append("時刻");
         sb.append("</tr>");
         sb.append("</th>");
      }
      else if(qName.equals("item")){
         isItem = true;
         sb.append("<tr>");               
      }
      else if(qName.equals("title")){
         if(isItem == true){
            isPrint = true;
            sb.append("<td>");
         }               
      }
      else if(qName.equals("pubDate")){
         if(isItem == true){
            isPrint = true;
            sb.append("<td>");
         }
      }
   }
   public void endElement(String namespaceURI,
                          String localName,
                          String qName){
      if(qName.equals("rss")){
         sb.append("</table>");
         sb.append("</html>");
      }
      else if(qName.equals("item")){
         sb.append("</tr>");               
      }
      else if(qName.equals("title")){
         if(isItem == true){
            sb.append("</td>");               
            isPrint = false;
         }
      }
      else if(qName.equals("pubDate")){
            sb.append("</td>");               
         isPrint = false;
      } 
   }
   public void characters(char[] ch, int start,int length){
      String str = new String(ch, start, length);
      if(str.trim().length() != 0 && isPrint == true){
            sb.append(str);
      }
   }
}
