import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample7
{
   public static void main(String args[]) throws Exception
   {
      //SAXの準備をする
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //ハンドラを作成する
      SampleHandler7 sh = new SampleHandler7();

      //文書を読み込む
      sp.parse(args[0], sh);
   }
}

//ハンドラクラス
class SampleHandler7 extends DefaultHandler
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
      }
      else if(qName.equals("item")){
         isItem = true;
         sb.append("<p>");               
      }
      else if(qName.equals("title")){
         if(isItem == false){
            isPrint = true;
            sb.append("<center>");
            sb.append("<h1>");               
         }
         else{
            isItemTitle = true;
            sb.append("<h3>");
            sb.append("<a href=\"");
         }               
      }
      else if(qName.equals("link")){
         if(isItem == true){
            isPrint = true;
         } 
      }
      else if(qName.equals("description")){
         isPrint = true;
         if(isItem == false){
            sb.append("<center>");               
         }
      }
   }
   public void endElement(String namespaceURI,
                          String localName,
                          String qName){
      if(qName.equals("rss")){
         sb.append("</html>");
      }
      else if(qName.equals("title")){
         if(isItem == false){
            sb.append("</h1>");               
            sb.append("</center>");
         }
         else{
            isItemTitle = false;
         }               
         isPrint = false;
      }
      else if(qName.equals("link")){
         if(isItem == true){
            sb.append("\">");
            sb.append(title);
            sb.append("</a>");
            sb.append("</h3>");               
            isPrint = false;
         }
      } 
      else if(qName.equals("description")){
         if(isItem == false){
            sb.append("<br/><hr/>");
            sb.append("</center>");               
         }
         isPrint = false;
      }
   }
   public void characters(char[] ch, int start,int length){
      String str = new String(ch, start, length);
      if(str.trim().length() != 0 && isPrint == true){
            sb.append(str);
      }
      else if(isItemTitle == true){
            title = str;
      }
   }
}
