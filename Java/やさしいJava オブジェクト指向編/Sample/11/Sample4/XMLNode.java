import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLNode
{
   private Node node;

   public XMLNode(Node n)
   {
      node = n;
   }
   public String toString()
   {
      int type = node.getNodeType();
      switch(type){
         case Node.ELEMENT_NODE:
            return node.getNodeName();
      }
      return node.getNodeValue();
   }
   public NodeList getChildNodes()
   {
      return node.getChildNodes(); 
   } 
}