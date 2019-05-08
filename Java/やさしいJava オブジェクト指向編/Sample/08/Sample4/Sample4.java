import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample4 extends JFrame
{
   public static void main(String args[])
   {
      Sample4 sm = new Sample4();
   }
   public Sample4()
   {
      super("ƒTƒ“ƒvƒ‹");
      String  content = null;
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

      Factory f = new SeniorFactory();

      JLabel title = f.createTitle();
      JTextArea body = f.createMain(content);
      JLabel option = f.createOption();

      add(title, BorderLayout.NORTH);
      add(body, BorderLayout.CENTER);
      add(option, BorderLayout.SOUTH);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
}
