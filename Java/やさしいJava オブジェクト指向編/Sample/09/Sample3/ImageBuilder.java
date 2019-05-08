import java.awt.*;
import java.awt.image.*;

public interface ImageBuilder
{
   public void setImage(Image img, int w, int h);
   public void grabPixel();
   public void convert();
   public Image getImage();
}

