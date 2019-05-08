import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

class Sample12
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
      Document doc = db.parse(args[0]);

     //ルート要素を得る
      Element root = doc.getDocumentElement();

     //ルート要素開始タグを作成する
     sb.append("<html>");
     sb.append("<body>");               

     //文書をたどる
     walk(root);

     //ルート要素終了タグを作成する
     sb.append("</body>");               
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
            if(ch.getNodeName().equals("channel")){
                  walk(ch);
            }
            else if(ch.getNodeName().equals("item")){
                  walk(ch);
            }
            else if(ch.getNodeName().equals("title")){
               if(ch.getParentNode().getNodeName().equals("channel")){
                  sb.append("<center>");               
                  sb.append("<h1>");               
                  walk(ch);
                  sb.append("</h1>");               
                  sb.append("</center>");               
               }
               else{
                  sb.append("<h3>");               
                  sb.append("<a href=\"");
                  for(Node s = ch;
                           s != null;
                           s = s.getNextSibling()){
                     if(s.getNodeName().equals("link")){
                        for(Node c = s.getFirstChild();
                                 c != null;
                                 c = c.getNextSibling()){
                           if(c.getNodeType() == Node.TEXT_NODE
                              && c.getNodeValue().trim().length() != 0){
                              sb.append(c.getNodeValue());
                           }
                        }
                     }
                  }
                  sb.append("\"/>");
                  walk(ch);
                  sb.append("</a>");               
                  sb.append("</h3>");               
               }  
            }
            else if(ch.getNodeName().equals("description")){
               if(ch.getParentNode().getNodeName().equals("channel")){
                  sb.append("<center>");               
                  walk(ch);
                  sb.append("<br/><hr/>");               
                  sb.append("</center>");               
               }
               else{
                  walk(ch);
               }  
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
