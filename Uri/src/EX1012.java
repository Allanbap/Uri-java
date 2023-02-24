import java.util.Scanner;

/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1012
 * Author : Allan Baptista Santos
 * OBS: public class EX1012 has to be renamed to Main to be accepted.
 */
public class EX1012 {

    public static void main(String[] args) {
        double x[] = new double[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<3;i++){
            x[i] = sc.nextDouble();
        }
        System.out.println("TRIANGULO: "+String.format("%.3f",(x[0]*x[2])/2));
        System.out.println("CIRCULO: "+String.format("%.3f",(x[2]*x[2])*3.14159));
        System.out.println("TRAPEZIO: "+String.format("%.3f",((x[0]+x[1])*x[2])/2));
        System.out.println("QUADRADO: "+String.format("%.3f",x[1]*x[1]));
        System.out.println("RETANGULO: "+String.format("%.3f",x[0]*x[1]));

    }
}
