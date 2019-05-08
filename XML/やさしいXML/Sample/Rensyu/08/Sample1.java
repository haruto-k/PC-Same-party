import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample1
{
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

     //文書をたどる
     walk(root);

   }

   //ノードの子をたどる
   public static void walk(Node n)
   {
      for(Node ch = n.getFirstChild();
               ch != null;
               ch = ch.getNextSibling()){

         //要素を処理する
         if(ch.getNodeType() == Node.ELEMENT_NODE){
            System.out.println(ch.getNodeName());
            System.out.println(ch.getNodeType());
            System.out.println(ch.getNodeValue());
            walk(ch);
         }
         //テキストを処理する
         else if(ch.getNodeType() == Node.TEXT_NODE
                     && ch.getNodeValue().trim().length() != 0){
            System.out.println(ch.getNodeName());
            System.out.println(ch.getNodeType());
            System.out.println(ch.getNodeValue());
         }
      }
   }
}
