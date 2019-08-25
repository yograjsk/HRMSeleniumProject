package hrChallenges;

import net.bytebuddy.asm.Advice;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Solution8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale localeUS = Locale.US;
        Locale localeIndia = new Locale.Builder().setLanguage("en").setRegion("IN").build();
        Locale localeChina = Locale.CHINA;
        Locale localeFrance = Locale.FRANCE;

        NumberFormat us = NumberFormat.getCurrencyInstance(localeUS);
        NumberFormat india = NumberFormat.getCurrencyInstance(localeIndia);
        NumberFormat china = NumberFormat.getCurrencyInstance(localeChina);
        NumberFormat france = NumberFormat.getCurrencyInstance(localeFrance);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}//end of class

