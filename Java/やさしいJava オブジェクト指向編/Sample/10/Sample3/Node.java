import java.util.*;

public interface Node
{
   public String getNodeName();
   public Vector<Node> getChildren();
   public void accept(Visitor v);
}
