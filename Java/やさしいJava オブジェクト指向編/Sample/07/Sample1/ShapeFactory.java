public class ShapeFactory
{
   private Shape sh;

   public Shape createShape(int state, int x, int y)
   {
       if(state == Shape.CIRCLE){
          sh = new Circle(x, y);
       }
       else if(state == Shape.RECTANGLE){
          sh = new Rectangle(x, y);
       }
       else{
          sh = new Line(x, y);
       }
      return sh;
   }
}