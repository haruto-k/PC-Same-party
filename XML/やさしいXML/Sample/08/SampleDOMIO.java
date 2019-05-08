import java.io.*;
import org.w3c.dom.*;
import org.w3c.dom.ls.*; 
import org.w3c.dom.bootstrap.*;

class SampleDOMIO
{
   public static void main(String args[]) throws Exception
   {
      //DOM‚Ì€”õ‚ğ‚·‚é
      DOMImplementationRegistry reg = DOMImplementationRegistry.newInstance();
      DOMImplementationLS di = (DOMImplementationLS)reg.getDOMImplementation("XML 1.0"); 

      //•¶‘‚ğ“Ç‚İ‚Ş
      LSInput in = di.createLSInput();
      in.setByteStream(new FileInputStream("Sample.xml"));
      LSParser ps = di.createLSParser(DOMImplementationLS.MODE_SYNCHRONOUS, null);
      Document doc = ps.parse(in);

      //•¶‘‚ğ‘‚«o‚·
      LSOutput out = di.createLSOutput();
      out.setByteStream(new FileOutputStream("result.xml"));
      out.setEncoding("Shift_JIS");
      LSSerializer srl = di.createLSSerializer();
      srl.write(doc, out);
   }
}

