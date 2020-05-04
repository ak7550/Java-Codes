package AkPackage;

import java.util.Random;
import java.time.*;

public class Ran extends Random {
    private static final long serialVersionUID = 1L;
    String s = "1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    String smallletters = "qwertyuiopasdfghjklzxcvbnm", specialSymbols = "~!@#$%^&*()_+`={}[]<>,.?/|";
    String numbers = "1234567890", capitalLetters = "QWERTYUIOPASDFGHJKLZXCVBNM";
    Random rand = new Random();

    public final String getString(int max) {
        StringBuilder str = new StringBuilder(max);
        for (int i = 0; i < rand.nextInt(max - 1) + 1; i++) // so that we will never get a null value.
            str.append(s.charAt(rand.nextInt(s.length())));
        return str.toString();
    }

    public final String getString(int max, String s) {
        StringBuilder str = new StringBuilder(max);
        for (int i = 0; i < rand.nextInt(max - 1) + 1; i++) // so that we will never get a null value or a 0 value
            str.append(s.charAt(rand.nextInt(s.length())));
        return str.toString();
    }

    public final String getString() {
        return getString(100);
    }

    public String getStringFixedLength(int length, String s) {
        StringBuilder str = new StringBuilder(length);
        for (int i = 0; i < length; i++) // so that we will never get a null value.
            str.append(s.charAt(rand.nextInt(s.length())));
        return str.toString();
    }

    public LocalDate getRandomDate() {
        return getRandomDate(2000);
    }

    public LocalDate getRandomDate(int range) {
        LocalDate temp = LocalDate.now();
        int randomYear = range + rand.nextInt(temp.getYear() - range), randomMonth = rand.nextInt(11) + 1;
        Month mn = Month.of(randomMonth);
        temp = temp.withYear(randomYear);
        int dayOfMonth = rand.nextInt(mn.length(temp.isLeapYear()));
        return LocalDate.of(randomYear, randomMonth, dayOfMonth);
    }

    public int nextInt(int lowerBound, int upperBound) {
        return rand.nextInt(upperBound - lowerBound) + lowerBound;
    }

    public String getRandomEmail() {
        return getStringFixedLength(1, smallletters) + getString(20, (smallletters + numbers)) + "@" + getStringFixedLength(6, smallletters)
                + "." + getStringFixedLength(3, smallletters);
    }
}