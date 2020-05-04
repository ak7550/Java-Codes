package PackageTesting.AkPackage;
import java.util.Random;
import java.time.*;
public class Ran extends Random
{
    private static final long serialVersionUID = 1L;
    String s = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    Random rand = new Random();
    public final String getString(int max) 
    {
        StringBuilder str = new StringBuilder(max);
        for (int i = 0; i < rand.nextInt(max-1)+1; i++) // so that we will never get a null value.
            str.append(s.charAt(rand.nextInt(s.length())));
        return str.toString();
    }
    public final String getString()
    {
        return getString(100);
    }
    public LocalDate getRandomDate() {
        return getRandomDate(2000);
    }
    public LocalDate getRandomDate(int range) {
        LocalDate temp=LocalDate.now();
        int randomYear=range+rand.nextInt(temp.getYear()-range),randomMonth=rand.nextInt(11)+1;
        Month mn= Month.of(randomMonth);
        temp=temp.withYear(randomYear);
        int dayOfMonth=rand.nextInt(mn.length(temp.isLeapYear()));
        return LocalDate.of(randomYear, randomMonth, dayOfMonth);
    }
}
