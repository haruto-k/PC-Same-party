import java.util.*;

public class WeightVisitor implements Visitor
{
   private Vector<String> list = new Vector<String>();

   public void visit(Person p)
   {
      list.add(new String("Weight:" + p.getWeight())); 
   }
   public Vector<String> getList()
   {
      return list;
   }
}
