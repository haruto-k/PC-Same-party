import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample2
{
   public static void main(String args[]) throws Exception
   {
      //SAXの準備をする
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //ハンドラを作成する
      SampleHandler2 sh = new SampleHandler2();

      //文書を読み込む
      sp.parse(new FileInputStream("Sample.xml"), sh);

   }
}

//ハンドラクラス
class SampleHandler2 extends DefaultHandler
{
   //文書の開始
   public void startDocument() 
   {
      System.out.println("XML文書が開始しました。");
   }

   //文書の終了
   public void endDocument() 
  {
      System.out.println("XML文書が終了しました。");
   }

   //要素の開始
   public void startElement(String namespaceURI,
                            String localName,
                            String qName, 
                            Attributes attrs) 
   {
      System.out.println(qName + "が開始しました。");
   }

   //要素の終了
   public void endElement(String namespaceURI,
                          String localName,
                          String qName) 
   {
      System.out.println(qName + "が終了しました。");
   }
}

