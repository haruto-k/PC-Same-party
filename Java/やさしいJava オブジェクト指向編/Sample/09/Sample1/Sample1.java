import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample1 extends JFrame implements ActionListener
{
   private JTextArea ta;
   private JButton bt;
   private JPanel pn;

   public static void main(String args[])
   {
      Sample1 sm = new Sample1();
   }
   public Sample1()
   {
      super("ÉTÉìÉvÉã");
      String content = null;
      try{
         BufferedReader br = new BufferedReader(new FileReader("Yasacii.txt"));
         String str;
         StringBuffer sb = new StringBuffer();
         while((str = br.readLine()) != null){
            sb.append(str);
         }
         content = sb.toString();
         br.close();
      }catch(IOException e){}

      ta = new JTextArea(content);
      ta.setLineWrap(true);
      bt = new JButton("çƒì«çû");
      pn = new JPanel();

      pn.add(bt);
      add(ta, BorderLayout.CENTER);
      add(pn, BorderLayout.SOUTH);

      bt.addActionListener(this);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
      String content = null;
      try{
         BufferedReader br = new BufferedReader(new FileReader("Yasacii.txt"));
         String str;
         StringBuffer sb = new StringBuffer();
         while((str = br.readLine()) != null){
            sb.append(str);
         }
         content = sb.toString();
         br.close();
      }catch(IOException ex){}
      ta.setText(content);
   }
}
