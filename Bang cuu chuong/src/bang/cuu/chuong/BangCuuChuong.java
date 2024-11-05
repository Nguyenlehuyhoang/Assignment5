
package bang.cuu.chuong;

import java.util.Scanner;


public class BangCuuChuong {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so de in bang cuu chuong: ");
        int number = scanner.nextInt();

        System.out.println("Bang cuu chuong cua " + number + " la:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
}
