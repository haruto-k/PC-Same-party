import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class SeniorFactory implements Factory
{
   public JLabel createTitle()
   {
      JLabel lb = new JLabel("Introduction");
      lb.setFont(new Font("Courier", Font.BOLD, 20));
      return lb;
   }
   public JTextArea createMain(String content)
   {
      JTextArea ta = new JTextArea(content);
      ta.setFont(new Font("ROMAN", Font.PLAIN, 12));
      ta.setLineWrap(true);
      ta.setBorder(new EtchedBorder());
      return ta;
   }
   public JLabel createOption()
   {
      JLabel lb = new JLabel("Yasacii Programming");
      lb.setFont(new Font("Courier", Font.ITALIC, 10));
      return lb;
   }
}
