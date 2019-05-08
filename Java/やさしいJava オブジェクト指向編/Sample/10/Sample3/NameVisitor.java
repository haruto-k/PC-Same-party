import java.util.*;

public class NameVisitor implements Visitor
{
   private Vector<String> list = new Vector<String>();

   public void visit(Person p)
   {
      list.add("---Person:" + p.getNodeName()); 
   }
   public void visit(Section s)
   {
      list.add("Section:" + s.getNodeName()); 
   }
   public Vector<String> getList()
   {
      return list;
   }
}
