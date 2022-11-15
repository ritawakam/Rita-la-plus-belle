import java.io.File;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("entrer deux nombres : ");
        int M = val.nextInt();
        int N = val.nextInt();
        int i, m = 0;
        for (i = 1; i <= M && i <= N; i++) {
            if (M % i == 0 && N % i == 0) {
                System.out.println(i);
                m = i;
            }
        }
        System.out.println("PGCD= " +m);
    }
}



