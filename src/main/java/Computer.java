import java.util.Calendar;
import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        long n = 461012;
        System.out.format("%d %n", n);
        System.out.format("%08d%n", n);
        System.out.format("%+8d%n", n);
        System.out.format("%,8d%n", n);
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
        //  -->  "461012"
//  -->  "00461012"
//  -->  " +461012"
// -->  " 461,012"
        double pi = Math.PI;
        System.out.format("%f %n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%12.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-5.3f %d %n", 3.145678, 10);  // -->  "3.142"
        System.out.printf("%-10.4s %s %n", "Hi there!", "hello");
        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"
        System.out.format("%tD%n", c);    // -->  "05/29/06"
    }
}
