import javax.swing.*;

public class CutCommand implements Command
{
   private JTextArea ta;

   public CutCommand(JTextArea ta)
   {
      this.ta = ta;  
   }
   public void execute()
   {
      ta.cut();
    }
}
