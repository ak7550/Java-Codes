import AkPackage.Ran;
class Tollbooth
{
    int carsPassedBy, moneyCollected, passedWithoutPaying;
    Tollbooth(int c, int m)
    {
        carsPassedBy=c;
        moneyCollected=m;
        passedWithoutPaying=carsPassedBy-moneyCollected/50;
    }
}
class Bridge
{
  int carsPassedBy;
  Bridge(int c)
  {
      carsPassedBy=c;
  }
}
class ass17
{
  public static void main(String args[])
  {
    Ran rand=new Ran();
    int c1=rand.nextInt(10000);
    int m1=rand.nextInt(c1<0?-c1:c1);
    Tollbooth t=new Tollbooth(c1<0?-c1:c1,m1*50);
    int c2=rand.nextInt(10000);
    Bridge br=new Bridge(c2<0?-c2:c2);
    System.out.println("Total number of cars passed by without paying: "+ (t.passedWithoutPaying+br.carsPassedBy));
    System.out.println("Total number of cars passed by: "+(t.carsPassedBy+br.carsPassedBy));
    System.out.println("Total cash collected: "+t.moneyCollected);
  }
}