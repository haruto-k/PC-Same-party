import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class Sample1 extends JFrame
{
   private JTable tb;
   private JScrollPane sp;

   public static void main(String args[])
   {
      Sample1 sm = new Sample1();
   }
   public Sample1()
   {
      super("ƒTƒ“ƒvƒ‹");

      tb = new JTable(new CharTableModel());
      sp = new JScrollPane(tb);

      add(sp, BorderLayout.CENTER);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300,300);
      setVisible(true);
   }
}