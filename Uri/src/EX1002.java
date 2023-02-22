import java.io.IOException;
import java.util.Scanner;
/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1002
 * Author : Allan Baptista Santos
 * OBS: public class EX1002 has to be renamed to Main to be accepted.
 */
public class EX1002 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
        double R = sc.nextDouble();
        double A = n*(R*R);
        System.out.println("A="+ String.format("%.4f",A));
    }

}
