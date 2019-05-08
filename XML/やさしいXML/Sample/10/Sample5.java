import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample5
{
   public static void main(String args[]) throws Exception
   {
      //SAXの準備をする
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //ハンドラを作成する
      SampleHandler5 sh = new SampleHandler5();

      //文書を読み込む
      sp.parse(new FileInputStream("Sample.xml"), sh);
   }
}

//ハンドラクラス
class SampleHandler5 extends DefaultHandler
{
   //文字列を用意する
   StringBuffer sb = new StringBuffer();

   //文書の開始
   public void startDocument() {
      sb.append
     ("<?xml version=\"1.0\" encoding=\"Shift_JIS\" ?>");
   }

   //文書の終了
   public void endDocument() {
      //文字列を書き出す
      try{
         PrintWriter pw = new PrintWriter
           (new BufferedWriter
           (new FileWriter("result.xml")));
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
         sb.append("<車リスト>");
      }
      else if(qName.equals("car")){
         sb.append("<車>");
      }
      else if(qName.equals("name")){
         sb.append("<品名>");
      }
      else if(qName.equals("price")){
         sb.append("<価格>");
      }
   }

   //要素の終了
   public void endElement(String namespaceURI,
                          String localName,
                          String qName)
   {
      if(qName.equals("cars")){
         sb.append("</車リスト>");
      }
      else if(qName.equals("car")){
         sb.append("</車>");
      }
      else if(qName.equals("name")){
         sb.append("</品名>");
      }
      else if(qName.equals("price")){
         sb.append("</価格>");
      }
   }

   //文字データ
   public void characters(char[] ch, int start, int length)                                             {
      String str = new String(ch, start, length);
      if(str.trim().length() != 0){
            sb.append(str);
      }
   }
}

