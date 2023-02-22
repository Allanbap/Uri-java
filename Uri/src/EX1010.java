import java.util.Scanner;

/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1010
 * Author : Allan Baptista Santos
 * OBS: public class EX1010 has to be renamed to Main to be accepted.
 */
public class EX1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[2];
        int B[] = new int[2];
        double C[] = new double[2];
        for(int i=0;i<2;i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextDouble();
        }
        C[1] = B[1]*C[1] + B[0]*C[0];
        System.out.println("VALOR A PAGAR: R$ "+ String.format("%.2f", C[1]));
    }
}
