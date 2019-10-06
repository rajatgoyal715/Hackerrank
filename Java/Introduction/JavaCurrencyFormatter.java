import java.io.*;
import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        // NumberFormat nf = NumberFormat.getInstance();
        // nf.setMaximumFractionDigits(2);
        // nf.setMinimumFractionDigits(2);
        // Currency us_currency = Currency.getInstance("USD");
        // nf.setCurrency(us_currency);
        // System.out.println("US: " + nf.format(payment));
        // Currency in_currency = Currency.getInstance("INR");
        // nf.setCurrency(in_currency);
        // System.out.println("India: " + nf.format(payment));

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
