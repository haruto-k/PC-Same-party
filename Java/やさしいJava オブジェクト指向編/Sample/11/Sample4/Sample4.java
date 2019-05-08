import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class Sample4 extends JFrame implements ActionListener
{
   private JTree tr;
   private JScrollPane sp;
   private JButton bt;
   private JPanel pn;

   public static void main(String args[])
   {
      Sample4 sm = new Sample4();
   }
   public Sample4()
   {
      super("ÉTÉìÉvÉã");

      String t[] = {"root"};
      tr = new JTree(t);

      sp = new JScrollPane(tr);
      pn = new JPanel();
      bt = new JButton("ì«çû");

      pn.add(bt);
      add(sp, BorderLayout.CENTER);
      add(pn, BorderLayout.SOUTH);

      bt.addActionListener(this);

      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setSize(300, 300);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
      JFileChooser fc = new JFileChooser();
      fc.setFileFilter(new XMLFileFilter());
      try{
         int res = fc.showOpenDialog(this);
         if(res == JFileChooser.APPROVE_OPTION){       
            File fl = fc.getSelectedFile();
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new BufferedInputStream(new FileInputStream(fl)));
            tr.setModel(new XMLTreeModel(doc));
         }
      }
      catch(Exception ex){}
   }
}

