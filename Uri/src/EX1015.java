import java.util.Scanner;

/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1014
 * Author : Allan Baptista Santos
 * OBS: public class EX1015 has to be renamed to Main to be accepted.
 */
public class EX1015 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x[] = new double[2];
        double y[] = new double[2];
        for(int i =0;i<2;i++){
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }
        x[0] =Math.sqrt(Math.pow(x[1]-x[0],2) + Math.pow(y[1]-y[0],2));
        System.out.println(String.format("%.4f",x[0]));

    }
}
