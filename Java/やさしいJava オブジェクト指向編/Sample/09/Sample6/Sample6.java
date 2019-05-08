import java.awt.*;
import javax.swing.*;

public class Sample6 extends JFrame
{
   public static void main(String args[])
   {
      Sample6 sm = new Sample6();
   }
   public Sample6()
   {
      super("ƒTƒ“ƒvƒ‹");
      JToolBar tl = new JToolBar();
   
      Manager mn = new Manager();

      MyTextArea ta = new MyTextArea(mn);
      ta.setLineWrap(true);

      MyLabel lb = new MyLabel(mn);
      CutButton tb = new CutButton(mn); 
      CopyButton cb = new CopyButton(mn); 
      PasteButton pb = new PasteButton(mn); 

      mn.registerCutButton(tb);
      mn.registerCopyButton(cb);
      mn.registerPasteButton(pb);
      mn.registerLabel(lb);
      mn.registerTextArea(ta);

      tl.add(tb);
      tl.add(cb);
      tl.add(pb);
      add(tl, BorderLayout.NORTH);
      add(ta, BorderLayout.CENTER);
      add(lb, BorderLayout.SOUTH);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
}
