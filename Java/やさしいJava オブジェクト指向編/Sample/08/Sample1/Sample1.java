import java.awt.*;
import javax.swing.*;

public class Sample1
{
   public static void main(String args[])
   {
      FrameBuilder fb = new ToolEditorBuilder();
      Manager mn = new Manager(fb);
      mn.buildFrame();
      JFrame fr = fb.getFrame();
   }
}
