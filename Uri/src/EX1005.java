import java.util.Scanner;


/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1005
 * Author : Allan Baptista Santos
 * OBS: public class EX1005 has to be renamed to Main to be accepted.
 */
public class EX1005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double media = ((A*3.5)+(B*7.5))/11;
        System.out.println("MEDIA = " +String.format("%.5f",media));

    }
}

