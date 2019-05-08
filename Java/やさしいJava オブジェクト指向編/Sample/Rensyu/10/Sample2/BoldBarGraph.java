import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoldBarGraph extends JFrame implements Observer
{
   private Vector<Integer> data = new Vector<Integer>();

    public BoldBarGraph()
   {
      super("ƒOƒ‰ƒt1");

      BoldBarPanel bbp = new BoldBarPanel();
      add(bbp, BorderLayout.CENTER);

      setLocation(0, 200);
      setSize(300, 300);
   }
   public void update(Vector<Integer> d)
   {
      data = d;
      repaint();
   }
   public class BoldBarPanel extends JPanel
   {
      public void paint(Graphics g)
      {
        if(data.size() == 0)return;
        int pw = getWidth();
        int ph = getHeight();
        int n = data.size();
        int m = 10;
        int s = 30;
        int w = (pw-s)/n;
        int h = 3;

        for(int i=0; i<n; i++){
           int d = Integer.parseInt(data.get(i).toString());
           g.setColor(Color.orange);
           g.fillRect((s/2)+i*w, ph-d*h,w-m, d*h);
           g.setColor(Color.black);
           g.drawRect((s/2)+i*w, ph-d*h,w-m, d*h);
        }
      }
   }
}
