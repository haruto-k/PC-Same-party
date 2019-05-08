import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample9
{
   //文字列を用意する
   static StringBuffer sb = new StringBuffer();

   public static void main(String args[]) throws Exception
   {
      //DOMの準備をする
      DocumentBuilderFactory dbf
         = DocumentBuilderFactory.newInstance();
      DocumentBuilder db
         = dbf.newDocumentBuilder();

      //文書を読み込む
      Document doc
         = db.parse(new FileInputStream("Sample.xml"));

     //ルート要素を得る
      Element root = doc.getDocumentElement();

     //XML宣言を作成する
     sb.append("<?xml version=\"1.0\" encoding=\"Shift_JIS\" ?>");

     //ルート要素開始タグを作成する
     sb.append("<車リスト>");

     //文書をたどる
     walk(root);

     //ルート要素終了タグを作成する
     sb.append("</車リスト>");

     //文字列を書き出す
     PrintWriter pw = new PrintWriter
       (new BufferedWriter(new FileWriter("result.xml")));
     pw.println(sb);
     pw.close();
   }

   //指定したノードの子をたどる
   public static void walk(Node n)
   {
      for(Node ch = n.getFirstChild();
               ch != null;
               ch = ch.getNextSibling()){

         //要素を処理する
         if(ch.getNodeType() == Node.ELEMENT_NODE){

            if(ch.getNodeName().equals("car")){
               sb.append("<車>");
               walk(ch);
               sb.append("</車>");
            }
            else if(ch.getNodeName().equals("name")){
               sb.append("<品名>");
               walk(ch);
               sb.append("</品名>");
            }
            else if(ch.getNodeName().equals("price")){
               sb.append("<価格>");
               walk(ch);
               sb.append("</価格>");
            }
         }

         //テキストを処理する
         else if(ch.getNodeType() == Node.TEXT_NODE
                 && ch.getNodeValue().trim().length() != 0){
            sb.append(ch.getNodeValue());
         }
      }
   }
}
