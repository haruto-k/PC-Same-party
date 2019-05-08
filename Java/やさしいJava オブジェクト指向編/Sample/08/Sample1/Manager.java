public class Manager
{
   private FrameBuilder fb;

   public Manager(FrameBuilder fb)
   { 
      this.fb = fb; 
   }
   public void buildFrame()
   {
      fb.createFrame();
      fb.createComponents();
      fb.addListeners();
      fb.setFrame();
   }
} 