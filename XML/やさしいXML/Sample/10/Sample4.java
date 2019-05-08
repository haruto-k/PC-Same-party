import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample4
{
   public static void main(String args[]) throws Exception
   {
      //SAXの準備をする
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //ハンドラを作成する
      SampleHandler4 sh = new SampleHandler4();

      //文書を読み込む
      sp.parse(new FileInputStream("Sample.xml"), sh);
   }
}

//ハンドラクラス
class SampleHandler4 extends DefaultHandler
{
   //文字列を用意する
   StringBuffer sb = new StringBuffer();

   //文書の開始
   public void startDocument() 
   {
      sb.append
      ("<?xml version=\"1.0\" encoding=\"Shift_JIS\" ?>");
      sb.append("<cars>");
   }

   //文書の終了
   public void endDocument() 
   {
      sb.append("</cars>");
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
      if(qName.equals("car")){
         for(int i=0; i<attrs.getLength(); i++){
            sb.append("<" + attrs.getQName(i) + ">");
            sb.append(attrs.getValue(i));
            sb.append("</" + attrs.getQName(i) + ">");
         }
      }
   }
}
