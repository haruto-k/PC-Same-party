import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Manager
{
   private CopyButton cp;
   private CutButton ct;
   private PasteButton pb;
   private MyTextArea ta;
   private MyLabel lb;

   public void registerCopyButton(CopyButton cp)
   {
      this.cp = cp;
   }
   public void registerCutButton(CutButton ct)
   {
      this.ct = ct;
   }
   public void registerPasteButton(PasteButton pb)
   {
      this.pb = pb;
   }
   public void registerTextArea(MyTextArea ta)
   {
      this.ta = ta;
   }
   public void registerLabel(MyLabel lb)
   {
      this.lb = lb;
   }
   public void cut()
   {
      String s = ta.getSelectedText();
      if(s == null)
         s = "";
      lb.setText("Cut:" + s);
      ta.cut();
      ta.insert("<<Cut>>", ta.getCaret().getDot());
   }
   public void copy()
   {
      String s = ta.getSelectedText();
      if(s == null)
         s = "";
      lb.setText("Copy:" + s);
      ta.copy();
   }
   public void paste()
   {
      String s = ta.getSelectedText();
      lb.setText("Paste.");
      ta.insert("<<---", ta.getCaret().getDot());
      ta.paste();
      ta.insert("--->>", ta.getCaret().getDot());
   }
   public void caretUpdate()
   {
      if(ta.getSelectedText() == null){
         cp.setEnabled(false);
         ct.setEnabled(false);
      }
      else{
         cp.setEnabled(true);
         ct.setEnabled(true);
      }
   }
}
