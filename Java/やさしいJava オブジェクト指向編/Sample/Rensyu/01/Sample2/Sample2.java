import java.io.*;

public class Sample2
{
   public static void main(String args[]) throws Exception
   {
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      System.out.println("x���W����͂��Ă��������B");

      String str = br.readLine();
      int x = Integer.parseInt(str);

      System.out.println("y���W����͂��Ă��������B");

      str = br.readLine();
      int y = Integer.parseInt(str);

      System.out.println("���a����͂��Ă��������B");

      str = br.readLine();
      int r = Integer.parseInt(str);

      Circle c = new Circle(x,y,r);
      c.show();
   }
}
