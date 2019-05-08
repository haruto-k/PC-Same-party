import java.io.*;
import org.w3c.dom.*;
import org.w3c.dom.ls.*; 
import org.w3c.dom.bootstrap.*;
import org.w3c.dom.traversal.*;

class SampleDOMWalk
{
   public static void main(String args[]) throws Exception
   {
      //DOM�̏���������
      DOMImplementationRegistry reg = DOMImplementationRegistry.newInstance();
      DOMImplementationLS di = (DOMImplementationLS)reg.getDOMImplementation("XML 1.0"); 

      //������ǂݍ���
      LSInput in = di.createLSInput();
      in.setByteStream(new FileInputStream("Sample.xml"));
      LSParser ps = di.createLSParser(DOMImplementationLS.MODE_SYNCHRONOUS, null);
      Document doc = ps.parse(in);

      //���[�g�v�f�𓾂�
      Element root = doc.getDocumentElement();

      //�m�[�h�����ǂ�
      DocumentTraversal trv = (DocumentTraversal)doc;
      TreeWalker walker = trv.createTreeWalker(root,NodeFilter.SHOW_ELEMENT | NodeFilter.SHOW_TEXT ,null,false); 

      for(Node ch = walker.firstChild();
               ch != null;
               ch = walker.nextNode()){

         //�v�f����������
         if(ch.getNodeType() == Node.ELEMENT_NODE){
            System.out.println(ch.getNodeName());
         }
         //�e�L�X�g����������
         else if(ch.getNodeType() == Node.TEXT_NODE
                     && ch.getNodeValue().trim().length() != 0){
            System.out.println(ch.getNodeValue());
         }
      }
   }
}

