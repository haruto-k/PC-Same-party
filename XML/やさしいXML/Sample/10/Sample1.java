import java.io.*;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.xml.sax.helpers.*;

class Sample1
{
   public static void main(String args[]) throws Exception
   {
      //SAXの準備をする
      SAXParserFactory spf
         = SAXParserFactory.newInstance();
      SAXParser sp = spf.newSAXParser();

      //ハンドラを作成する
      SampleHandler1 sh = new SampleHandler1();

      //文書を読み込む
      sp.parse(new FileInputStream("Sample.xml"), sh);

   }
}

//ハンドラクラス
class SampleHandler1 extends DefaultHandler
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
}
