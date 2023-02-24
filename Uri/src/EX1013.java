import java.util.Scanner;

/**
 * Exercise: https://www.beecrowd.com.br/judge/en/problems/view/1013
 * Author : Allan Baptista Santos
 * OBS: public class EX1013 has to be renamed to Main to be accepted.
 */
public class EX1013 {

    public static void main(String[] args) {
        int x[] = new int[3];
        int z = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<3;i++){
            x[i] = sc.nextInt();
            if(z <= x[i]){
                z = x[i];
            }
        }
        System.out.println(z+" eh o maior");


    }
}
