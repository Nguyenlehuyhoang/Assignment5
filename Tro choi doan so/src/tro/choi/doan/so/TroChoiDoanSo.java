
package tro.choi.doan.so;

import java.util.Random;
import java.util.Scanner;


public class TroChoiDoanSo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int soCanDoan = random.nextInt(50) + 1;
        int soDoan = 0;

        System.out.println("Chao mung den voi Tro Choi doan So!");
        System.out.println("Toi nghi mot so tu 1 den 50. Ban co doan duoc khong?");
        
        while (soDoan != soCanDoan) {
            System.out.print("Nhap so ban doan: ");
            soDoan = scanner.nextInt();

            if (soDoan < soCanDoan) {
                System.out.println("So cua ban nho hon. Thu lai.");
            } else if (soDoan > soCanDoan) {
                System.out.println("So cua ban lon hon. Thu lai.");
            } else {
                System.out.println("Chuc mung! Ban da doan dung so!");
            }
        }
        // TODO code application logic here
    }
    
}
