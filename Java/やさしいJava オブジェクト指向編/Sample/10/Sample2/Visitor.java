import java.util.*;

public interface Visitor
{
   public void visit(Person p);
   public Vector<String> getList();
}
