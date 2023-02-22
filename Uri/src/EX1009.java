import java.util.Scanner;

/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1009
 * Author : Allan Baptista Santos
 * OBS: public class EX1009 has to be renamed to Main to be accepted.
 */
public class EX1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        C =B+(C*0.15);
        System.out.println("TOTAL = R$ "+ String.format("%.2f", C));
    }
}
