import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample3 extends JFrame
{
   private JList ls;

   public static void main(String args[])
   {
      Sample3 sm = new Sample3();
   }
   public Sample3()
   {
      super("ƒTƒ“ƒvƒ‹");

      Section s1 = new Section("Company");
      Section s2 = new Section("Trade");
      Section s3 = new Section("Accounting");

      Person p1 = new Person("Sato");
      Person p2 = new Person("Takahashi");
      Person p3 = new Person("Suzuki");

      s1.add(s2);
      s1.add(s3);
      s2.add(p1);
      s2.add(p2);
      s3.add(p3);

      Visitor v = new NameVisitor();

      Node root = s1;

      walkTree(root, v);

      Vector<String> nl = v.getList();

      ls = new JList<String>(nl);

      add(ls, BorderLayout.CENTER);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
   public void walkTree(Node n, Visitor v)
   {
      Vector<Node> children = n.getChildren();
      if(children == null) return;
      Iterator<Node> it = children.iterator();
      
      while(it.hasNext()){
         Node nn = it.next();
         nn.accept(v);     
         walkTree(nn, v); 
      }
   }
}
