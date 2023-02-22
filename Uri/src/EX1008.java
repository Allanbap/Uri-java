import java.util.Scanner;
/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1008
 * Author : Allan Baptista Santos
 * OBS: public class EX1008 has to be renamed to Main to be accepted.
 */
public class EX1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        double C = sc.nextDouble();
        C =B*C;
        System.out.println("NUMBER = "+ A);
        System.out.println("SALARY = U$ "+ String.format("%.2f", C));
    }
}
