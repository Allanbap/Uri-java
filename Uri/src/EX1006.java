import java.util.Scanner;
/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1006
 * Author : Allan Baptista Santos
 * OBS: public class EX1006 has to be renamed to Main to be accepted.
 */
public class EX1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
        System.out.println("MEDIA = " + String.format("%.1f", media));
    }
}
