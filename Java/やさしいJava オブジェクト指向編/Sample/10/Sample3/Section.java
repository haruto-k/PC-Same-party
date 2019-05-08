import java.util.*;

public class Section implements Node
{
   private String nodeName;
   private Vector<Node> children;

   public Section(String s)
   {
      nodeName = s;
      children = new Vector<Node>();
   }
   public void add(Node n)
   {
      children.add(n);
   }
   public String getNodeName()
   {
      return nodeName;
   }
   public Vector<Node> getChildren()
   {
      return children;
   }
   public void accept(Visitor v)
   {
      v.visit(this);
   }
}
