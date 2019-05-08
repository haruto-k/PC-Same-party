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
      sp.parse(new FileInputStream("Practice.xml"), sh);

   }
}

//ハンドラクラス
class SampleHandler1 extends DefaultHandler
{
   //文字データ
   public void characters(char[] ch, int start, int length)                            
   {
      String str = new String(ch, start, length);
      if(str.trim().length() != 0){
         System.out.println(str);
      }
   }
}

