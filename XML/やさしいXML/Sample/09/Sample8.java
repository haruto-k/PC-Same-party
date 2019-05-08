import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;
import org.w3c.dom.*;

class Sample8
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

      //文書を新規作成する
      Document doc2 = db.newDocument();

      //ルート要素を追加する
      Element root = doc2.createElement("cars");
      doc2.appendChild(root);

      //要素を取り出す
      NodeList lst = doc.getElementsByTagName("car");

      for(int i=0; i<lst.getLength(); i++){
         Node n = lst.item(i);
         NamedNodeMap attrlist = n.getAttributes();
         Node attr = attrlist.getNamedItem("country");
         Element elm = doc2.createElement("country");
         Text txt = doc2.createTextNode(attr.getNodeValue());
         elm.appendChild(txt);
         root.appendChild(elm);
      }

      //文書を書き出す
      TransformerFactory tff
         = TransformerFactory.newInstance();
      Transformer tf
         = tff.newTransformer();
      tf.setOutputProperty(OutputKeys.ENCODING, "Shift_JIS");
      tf.transform(new DOMSource(doc2), new StreamResult("result.xml"));
   }
}
