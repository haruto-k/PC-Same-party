import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample3
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

      //ルート要素の子をたどる
      walk(root);

   }

   //ノードの子をたどる
   public static void walk(Node n)
   {
      for(Node ch = n.getFirstChild();
               ch != null;
               ch = ch.getNextSibling()){
         System.out.println(ch.getNodeName());
      }
   }
}
