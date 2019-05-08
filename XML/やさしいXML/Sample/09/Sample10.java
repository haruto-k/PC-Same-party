import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample10
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

     //ルート要素開始タグを作成する
     sb.append("<html>");

     //文書をたどる
     walk(root);

     //ルート要素終了タグを作成する
     sb.append("</html>");

     //文字列を書き出す
     PrintWriter pw = new PrintWriter
       (new BufferedWriter(new FileWriter("result.html")));
     pw.println(sb);
     pw.close();
   }

   //ノードの子をたどる
   public static void walk(Node n)
   {
      for(Node ch = n.getFirstChild();
               ch != null;
               ch = ch.getNextSibling()){

         //要素を処理する
         if(ch.getNodeType() == Node.ELEMENT_NODE){

            if(ch.getNodeName().equals("car")){
               sb.append("<div>");
               walk(ch);
               sb.append("</div>");
            }
            else if(ch.getNodeName().equals("name")){
               sb.append("<h1>");
               walk(ch);
               sb.append("</h1>");
            }
            else if(ch.getNodeName().equals("price")){
               sb.append("<p>");
               walk(ch);
               sb.append("</p>");
            }
            else if(ch.getNodeName().equals("img")){
               sb.append("<img src=\"");
               NamedNodeMap attrlist = ch.getAttributes();
               Node attr = attrlist.getNamedItem("file");
               sb.append(attr.getNodeValue());
               sb.append("\"/>");
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
