import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample2 extends JFrame
{
   private SamplePanel sp;

   public static void main(String args[])
   {
      Sample2 sm = new Sample2();
   }
   public Sample2()
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
      Hook h[] = new Hook[30];

      public SamplePanel()
      {
         for(int i=0; i<30; i++){
            h[i] = new Hook();
         }
      }
      public void paint(Graphics g)
      {
         if(h[0] != null){
            for(int i=0; i<30; i++){
               h[i].draw(g);
            }
         }
      }
   }
}
