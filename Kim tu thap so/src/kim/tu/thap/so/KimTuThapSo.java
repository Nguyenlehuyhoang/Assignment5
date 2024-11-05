
package kim.tu.thap.so;

import java.util.Scanner;


public class KimTuThapSo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua kim tu thap: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    
}
