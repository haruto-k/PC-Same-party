import java.io.*;

public class Sample3
{
   public static void main(String args[]) throws Exception
   {
      Person p[];

      System.out.println("�l������͂��Ă��������B");

      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      int num = Integer.parseInt(str);

      p = new Person[num];       

      for(int i= 0; i<num; i++){
 
         System.out.println("�N�����͂��Ă��������B");
         str = br.readLine();
         int age = Integer.parseInt(str);
         
         System.out.println("�̏d����͂��Ă��������B");
         str = br.readLine();
         double weight = Double.parseDouble(str);

         System.out.println("�g������͂��Ă��������B");
         str = br.readLine();
         double height = Double.parseDouble(str);

         p[i] = new Person(age, weight, height);
      } 

      for(int i= 0; i<num; i++){
         p[i].show();
      }
   }
}
