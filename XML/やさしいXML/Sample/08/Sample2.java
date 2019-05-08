import java.io.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.xml.transform.dom.*;
import org.w3c.dom.*;

class Sample2
{
   public static void main(String args[]) throws Exception
   {
      //DOMの準備をする
      DocumentBuilderFactory dbf
         = DocumentBuilderFactory.newInstance();
      DocumentBuilder db
         = dbf.newDocumentBuilder();

      //文書を新規作成する
      Document doc = db.newDocument();

      //ルート要素を追加する
      Element root = doc.createElement("cars");
      doc.appendChild(root);

      //文書を書き出す
      TransformerFactory tff
         = TransformerFactory.newInstance();
      Transformer tf
         = tff.newTransformer();
      tf.setOutputProperty(OutputKeys.ENCODING, "Shift_JIS");
      tf.transform(new DOMSource(doc), new StreamResult("result.xml"));
   }
}

