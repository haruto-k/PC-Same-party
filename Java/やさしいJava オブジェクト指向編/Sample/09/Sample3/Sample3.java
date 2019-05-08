import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

public class Sample3 extends JFrame
{
   private JLabel lb1, lb2;
   private Image sourceImage, destImage;
   private JPanel pn;

   public static void main(String args[])
   {
      Sample3 sm = new Sample3();
   }
   public Sample3()
   {
      super("ƒTƒ“ƒvƒ‹");

      ImageIcon ic1 = new ImageIcon("rose.jpg");
      sourceImage = ic1.getImage();
      int w = sourceImage.getWidth(this);
      int h = sourceImage.getHeight(this);

      ImageBuilder ib = new RedImageBuilder();
      Manager mn = new Manager(ib);  
      mn.createImage(sourceImage, w, h);
      destImage = ib.getImage();

      ImageIcon ic2 = new ImageIcon(destImage);

      lb1 = new JLabel(ic1);
      lb2 = new JLabel(ic2);
      pn = new JPanel(new GridLayout(1,2));  

      pn.add(lb1);
      pn.add(lb2);
      add(pn);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }
}
