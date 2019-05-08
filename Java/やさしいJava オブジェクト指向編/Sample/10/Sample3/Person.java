import java.util.*;

public class Person implements Node
{
   private String nodeName;

   public Person(String s)
   {
      nodeName = s;
   }   
   public String getNodeName()
   {
      return nodeName;
   }
   public Vector<Node> getChildren()
   {
      return null;
   }
   public void accept(Visitor v)
   {
      v.visit(this);
   }
}
