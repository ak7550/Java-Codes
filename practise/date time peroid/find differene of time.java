import java.time.*;
import java.util.Calendar;
import java.util.Random;
// java.time.Period class models a quantity or amount of time in terms of years, months and days
class Time
{
    public static void main(String[] args) {
       Random rand=new Random();
       LocalDateTime nw=LocalDateTime.now();
       int year=nw.getYear();
       int randomYear=1100+rand.nextInt(year-1100), randomMonth=rand.nextInt(11)+1;
       
    }
}