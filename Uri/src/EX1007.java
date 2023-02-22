import java.util.Scanner;

/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1007
 * Author : Allan Baptista Santos
 * OBS: public class EX1007 has to be renamed to Main to be accepted.
 */
public class EX1007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
         D = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + D);
    }
}
