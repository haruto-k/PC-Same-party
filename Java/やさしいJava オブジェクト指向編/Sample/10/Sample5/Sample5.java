import java.io.*;
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sample5 extends JFrame implements ActionListener
{
   private BoldBarGraph bbg;
   private ThinBarGraph tbg;
   private BoldBarGraph bbg2;
   private Vector<Observer> obs;
   private JList<Integer> ls;
   private JScrollPane sp;
   private JButton bt;

   public static void main(String args[])
   {
      Sample5 sm = new Sample5();
   }
   public Sample5()
   {
      super("ÉTÉìÉvÉã");
      obs = new Vector<Observer>();
      bbg = new BoldBarGraph();
      tbg = new ThinBarGraph();
      bbg2 = new BoldBarGraph();
      addObserver(bbg);
      addObserver(tbg);
      addObserver(bbg2);

      ls= new JList<Integer>();
      sp = new JScrollPane(ls);
      bt = new JButton("ì«çû");

      add(sp, BorderLayout.CENTER);
      add(bt, BorderLayout.SOUTH);

      bt.addActionListener(this);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(400, 200);
      setVisible(true);
      bbg.setVisible(true);
      tbg.setVisible(true);
      bbg2.setVisible(true);
      bbg2.setLocation(600, 200);
   }
   void addObserver(Observer o)
   {
      obs.add(o);
   }
   void notifyObservers(Vector<Integer> d)
   {
      Iterator<Observer> it = obs.iterator();
      while(it.hasNext()){
         Observer o = it.next();
         o.update(d);
      }
   }
   public void actionPerformed(ActionEvent e)
   {
      JFileChooser fc = new JFileChooser();
      try{
         int res = fc.showOpenDialog(this);
         if(res == JFileChooser.APPROVE_OPTION){       
            File fl = fc.getSelectedFile();
            BufferedReader br = new BufferedReader(new FileReader(fl));

            Vector<Integer> data = new Vector<Integer>();
            String str;
            while((str = br.readLine()) != null){
               data.add(Integer.parseInt(str));

            }
            br.close();
            ls.setListData(data);
            notifyObservers(data);
         }
      }catch(Exception ex){}
   }
}
