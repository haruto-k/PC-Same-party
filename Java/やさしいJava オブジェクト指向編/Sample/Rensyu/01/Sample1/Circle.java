public class Circle
{
   private int x;
   private int y;
   private int r;

   public Circle(int x, int y, int r)
   {
      this.x = x;
      this.y = y;
      this.r = r;
   }
   public void show()
   {
      System.out.println("�~��(" + x + "," + y + ")�ɕ\�����܂��B");
      System.out.println("���a�̑傫����" + r + "�ł��B");
   }
}
