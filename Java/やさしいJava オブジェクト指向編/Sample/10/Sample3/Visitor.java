import java.util.*;

public interface Visitor
{
   public void visit(Person p);
   public void visit(Section s);
   public Vector<String> getList();
}
