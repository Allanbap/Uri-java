import java.util.Scanner;
import java.lang.Math;
/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1011
 * Author : Allan Baptista Santos
 * OBS: public class EX1011 has to be renamed to Main to be accepted.
 */
public class EX1011 {

    public static void main(String[] args) {
        double n =  3.14159;
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double volume = (4/3.0)*( n * Math.pow(A,3));
        System.out.println("VOLUME = "+ String.format("%.3f", volume));
    }
}
