import java.awt.*;
import javax.swing.*;

public class Sample2
{
   public static void main(String args[])
   {
      FrameBuilder fb = new MenuEditorBuilder();
      Manager mn = new Manager(fb);
      mn.buildFrame();
      JFrame fr = fb.getFrame();
   }
}
