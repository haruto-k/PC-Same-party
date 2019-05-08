import java.awt.*;

public class Manager
{
   private ImageBuilder ib;

   public Manager(ImageBuilder ib)
   {
      this.ib = ib;
   }
   public void createImage(Image img, int w, int h)
   {
      ib.setImage(img, w, h);
      ib.grabPixel();
      ib.convert();
   }
}