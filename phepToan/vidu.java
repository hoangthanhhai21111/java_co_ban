package phepToan;

import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a = ");
        int a = sc.nextInt();
        System.out.println("nhập b = ");
        int b = sc.nextInt();
        System.out.println(a + " = " + b +" : " + (a==b));
        // tương tự cho các phép toán khác
    }
}
