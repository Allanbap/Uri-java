import java.util.Scanner;

/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1014
 * Author : Allan Baptista Santos
 * OBS: public class EX1014 has to be renamed to Main to be accepted.
 */
public class EX1014 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double z = sc.nextDouble();
        z = x/z;
        System.out.println(String.format("%.3f",z)+" km/l");

    }
}
