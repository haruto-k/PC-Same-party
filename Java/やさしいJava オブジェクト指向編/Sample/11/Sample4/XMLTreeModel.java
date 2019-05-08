import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*; 
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLTreeModel implements TreeModel
{
   private Document doc;

   public XMLTreeModel(Document d)
   {
      doc = d;
   }
   public Object getRoot() 
   {
      return (new XMLNode(doc.getDocumentElement()));
   }
   public Object getChild(Object parent, int index) 
   {
      XMLNode node = (XMLNode) parent;
      NodeList children = node.getChildNodes();
      return new XMLNode(children.item(index));
   }
   public int getChildCount(Object parent) 
   {
      XMLNode node = (XMLNode) parent;
      NodeList children = node.getChildNodes();
      return children.getLength();
   }
   public int getIndexOfChild(Object parent, Object child) 
   {
      XMLNode node = (XMLNode) parent;
      NodeList children = node.getChildNodes();
      for(int i=0; i<children.getLength(); i++){
         if(child == children.item(i)){
            return i;
         }
      }
         return -1;
   }
   public boolean isLeaf(Object node) 
   {
      XMLNode n = (XMLNode) node;
      NodeList children = n.getChildNodes();
      if(children.getLength() == 0)
         return  true;
      else
         return false;
   }
   public void addTreeModelListener(TreeModelListener l){}
   public void removeTreeModelListener(TreeModelListener l){}
   public void valueForPathChanged(TreePath path ,Object newValue){}
}