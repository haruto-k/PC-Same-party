import java.awt.*;
import javax.swing.*;

public interface Factory
{
   public JLabel createTitle();
   public JTextArea createMain(String content);
   public JLabel createOption();
}
