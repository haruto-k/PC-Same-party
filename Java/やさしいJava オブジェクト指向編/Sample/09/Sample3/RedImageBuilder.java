import java.awt.*;
import java.awt.image.*;

public class RedImageBuilder implements ImageBuilder
{
   private int pixels[];
   private int w, h;
   private Image im;

   public void setImage(Image im, int w, int h)
   {
      this.w = w;
      this.h = h;
      this.im = im;
   }
   public void grabPixel()
   {
      pixels = new int[w * h];
      PixelGrabber pg = new PixelGrabber(im, 0, 0, w, h, pixels, 0, w);
      try{
         pg.grabPixels();
      }
      catch(Exception e){}
   }
   public void convert()
   {
      for(int i=0; i<w*h; i++){
         int alpha = (pixels[i] >> 24) & 0xFF;
         int red   = (pixels[i] >> 16) & 0xFF;
         int green = (pixels[i] >>  8) & 0xFF;
         int blue  = (pixels[i] >>  0) & 0xFF;
         red = 255;

         pixels[i] = (alpha << 24) | (red << 16) | (green << 8) | (blue << 0);  
      }
   }
   public Image getImage()
   {
      return Toolkit.getDefaultToolkit().createImage(new MemoryImageSource(w, h, pixels, 0, w));
   }
}