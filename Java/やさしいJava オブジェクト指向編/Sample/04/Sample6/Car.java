public class Car extends Vehicle
{
  public Car(int m)
  {
     meter = m;
     price = 100;
  }
  public void calcFare()
  {
     fare = meter * price;
     System.out.println("é‘óºÇÃâ^í¿ÇÕ" + fare + "Ç≈Ç∑ÅB");
  }
}
