import AkPackage.*;
// all the akpackage testing will be done here
public class akPackageTest {
    public static void main(String[] args) {
        Ran ran=new Ran();
        System.out.println("Random number in between 50 to 100 is:"+ran.nextInt(50, 100));
        System.out.println("Random Email is:"+ran.getRandomEmail());
    }
}