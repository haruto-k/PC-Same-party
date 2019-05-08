import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThinBarGraph extends JFrame implements Observer
{
   private Vector<Integer> data = new Vector<Integer>();

   public ThinBarGraph()
   {
      super("ƒOƒ‰ƒt2");

      ThinBarPanel tbp = new ThinBarPanel();
      add(tbp, BorderLayout.CENTER);

      setLocation(300, 200);
      setSize(300, 300);
   }
   public void update(Vector<Integer> d)
   {
      data = d;
      repaint();
   }
   public class ThinBarPanel extends JPanel
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
           for(int j=0; j<d; j++){
           g.setColor(Color.green);
              g.fillOval((s/2)+i*w, ph-(d-j)*h, h, h);
           }
        }
     }
   }
}
