import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample1 extends JFrame
{
   private SamplePanel sp;

   public static void main(String args[])
   {
      Sample1 sm = new Sample1();
   }
   public Sample1()
   {
      super("ƒTƒ“ƒvƒ‹");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300,300);
      sp = new SamplePanel();
      add(sp, BorderLayout.CENTER);
      setVisible(true);
   }
   public class SamplePanel extends JPanel
   {
      StringLabel st;
      ShadeLabel sh;
      

      public SamplePanel()
      {
         st = new StringLabel("Hello", 100,100);
         sh = new ShadeLabel(new StringLabel("GoodBye",200,200));
      }
      public void paint(Graphics g)
      {
         st.draw(g);
         sh.draw(g);
      }
   }
}
