import javax.swing.*;

public class PasteCommand implements Command
{
   private JTextArea ta;

   public PasteCommand(JTextArea ta)
   {
      this.ta = ta;
   }
   public void execute()
   {
      ta.insert("<<---", ta.getCaret().getDot());
      ta.paste();
      ta.insert("--->>", ta.getCaret().getDot());
   }
}
