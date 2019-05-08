import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LineGraph extends JFrame implements Observer
{
   private Vector<Integer> data = new Vector<Integer>();

   public LineGraph()
   {
      super("ƒOƒ‰ƒt2");

      LinePanel lp = new LinePanel();
      add(lp, BorderLayout.CENTER);

      setLocation(300, 200);
      setSize(300, 300);
   }
   public void update(Vector<Integer> d)
   {
      data = d;
      repaint();
   }
   public class LinePanel extends JPanel
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

        int dn = 0;
        int d = 0;
        for(int i=0; i<n; i++){
           d = data.get(i).intValue();
           g.setColor(Color.red);
           g.drawLine((s/2)+(i-1)*w, ph-dn*h, (s/2)+i*w, ph-d*h);
           dn = d;
        }
     }
   }
}
