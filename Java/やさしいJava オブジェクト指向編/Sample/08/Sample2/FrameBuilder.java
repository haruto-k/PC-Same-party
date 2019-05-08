import javax.swing.*;

public interface FrameBuilder
{
   public void createFrame();
   public void createComponents();
   public void addListeners();
   public void setFrame();
   public JFrame getFrame();
}
