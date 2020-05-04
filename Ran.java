
import java.util.Random;
public class Ran 
{
    String s = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    Random rand = new Random();

    public String getString(int max) 
    {
        StringBuilder str = new StringBuilder(max);
        for (int i = 0; i < rand.nextInt(max); i++)
            str.append(s.charAt(rand.nextInt(s.length())));
        if(str.length()==1|| str.length()==0)
            getString(max);
        return str.toString();
    }
    public String getString()
    {
        return getString(100);
    }

}
