public class Person
{
   private String name;
   private int age;
   private double weight;
   private double height;

   public Person(String n, int a, double w, double h)
   {
      name   = n; 
      age    = a;
      weight = w;
      height = h;
   }
   public String getName(){return name;}
   public int getAge(){return age;}
   public double getWeight(){return weight;}
   public double getHeight(){return height;}
   public void accept(Visitor v)
   {
      v.visit(this);
   }
}
