class A
{
   A()
   {
      System.out.println("A�̈���0�̃R���X�g���N�^�ł��B");
   }
   A(int a)
   {
      System.out.println("A�̈���1�̃R���X�g���N�^�ł��B");
   }
}
class B extends A
{
   B()
   {
      System.out.println("B�̈���0�̃R���X�g���N�^�ł��B");
   }
   B(int b)
   {
      super(b);
      System.out.println("B�̈���1�̃R���X�g���N�^�ł��B");
   }
}

class SampleP3
{
   public static void main(String[] args)
   {
      B b1 = new B();
      B b2 = new B(10);
   }
}