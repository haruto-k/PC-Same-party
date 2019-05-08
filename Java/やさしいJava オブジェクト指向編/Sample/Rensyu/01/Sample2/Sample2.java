import java.io.*;

public class Sample2
{
   public static void main(String args[]) throws Exception
   {
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      System.out.println("x座標を入力してください。");

      String str = br.readLine();
      int x = Integer.parseInt(str);

      System.out.println("y座標を入力してください。");

      str = br.readLine();
      int y = Integer.parseInt(str);

      System.out.println("半径を入力してください。");

      str = br.readLine();
      int r = Integer.parseInt(str);

      Circle c = new Circle(x,y,r);
      c.show();
   }
}
