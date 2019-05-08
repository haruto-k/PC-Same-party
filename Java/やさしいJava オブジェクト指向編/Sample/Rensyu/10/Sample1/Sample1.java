import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample1 extends JFrame
{
   private JList ls;

   public static void main(String args[])
   {
      Sample1 sm = new Sample1();
   }
   public Sample1()
   {
      super("ƒTƒ“ƒvƒ‹");

      Vector<Person> personlist = new Vector<Person>();
      Person p1 = new Person("Suzuki", 30, 50.5, 170.3);
      Person p2 = new Person("Sato", 18, 58.5, 175.1);
      Person p3 = new Person("Takahashi", 26, 51.3, 170);

      personlist.add(p1);
      personlist.add(p2);
      personlist.add(p3);

      Visitor v = new WHVisitor();

      Iterator<Person> it = personlist.iterator();
      while(it.hasNext()){
         Person p = it.next();
         p.accept(v);     
      }
      Vector<String> nl = v.getList();

      ls = new JList<String>(nl);

      add(ls, BorderLayout.CENTER);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
}