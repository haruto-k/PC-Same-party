import java.util.*;

public class Person implements Node
{
   String nodeName;

   public Person(String s)
   {
     nodeName = s;
   }   
   public String toString()
   {
      return "--member:" + nodeName;
   }
   public Vector<Node> getChildren()
   {
      return null;
   }
}
