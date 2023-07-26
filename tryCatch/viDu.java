package tryCatch;

import java.util.Scanner;

public class viDu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        try {
        System.out.println("nhap vao so nguyen:");
        n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("nhap sai kieu du lieu");
        }
        // System.out.println("nhap vao so nguyen:");
        // n = sc.nextInt();
        System.out.println("ket thuc chuong trinh");
        

    }
}
