public class Person
{
   private int age;
   private double weight;
   private double height;

   public Person(int age, double weight, double height)
   {
      this.age    = age;
      this.weight = weight;
      this.height = height;
   }
   public void show()
   {
      System.out.println("�N���" + age + "�̏d��" + weight + "�g����" + height + "�ł��B");
   }
}
