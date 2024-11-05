
package day.fibonacci;

import java.util.Scanner;


public class DayFibonacci {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so phan tu cua day Fibonacci: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Vui long nhap mot so nguyen duong.");
        } else {
            System.out.print("Day Fibonacci: ");
            
            int dauTien = 0, thuHai = 1;
            
            for (int i = 1; i <= n; i++) {
                System.out.print(dauTien + " ");
                
                int tiepTheo = dauTien + thuHai;
                
                dauTien = thuHai;
                thuHai = tiepTheo;
            }
        }
        // TODO code application logic here
    }
    
}
