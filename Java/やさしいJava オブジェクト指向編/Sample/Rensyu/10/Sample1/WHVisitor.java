import java.util.*;

public class WHVisitor implements Visitor
{
   private Vector<String> list = new Vector<String>();

   public void visit(Person p)
   {
      list.add(new String("Weight:" + p.getWeight())); 
      list.add(new String("Height:" + p.getHeight())); 
   }
   public Vector<String> getList()
   {
      return list;
   }
}
