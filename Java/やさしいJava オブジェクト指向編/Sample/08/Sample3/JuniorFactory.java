import java.awt.*;
import javax.swing.*;

public class JuniorFactory implements Factory
{
   public JLabel createTitle()
   {
      JLabel lb = new JLabel("�{���Љ�܂�");
      lb.setFont(new Font("ROMAN", Font.BOLD, 20));
      return lb;
   }
   public JTextArea createMain(String content)
   {
      JTextArea ta = new JTextArea(content);
      ta.setFont(new Font("ROMAN", Font.PLAIN, 12));
      ta.setLineWrap(true);
      return ta;
   }
   public JLabel createOption()
   {
      JLabel lb = new JLabel("�₳�����v���O���~���O");
      lb.setFont(new Font("ROMAN", Font.ITALIC, 10));
      return lb;
   }
}
