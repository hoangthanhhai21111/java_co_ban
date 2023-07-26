package baiTap;

import java.util.Scanner;

public class ptBac2 {
    public static void main(String[] args) {
        double a, b, c, x, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp a:");
        a = sc.nextDouble();
        System.out.println("nhap b:");
        b = sc.nextDouble();
        System.out.println("nhap c:");
        c = sc.nextDouble();
        if (a == 0) {
            System.out.println("nhập dữ liệu sai");
        } else {
            delta = Math.pow(b, 2) - 4 * (a * c);
            if (delta < 0) {
                System.out.println("pt vo nghiem");
            } else {
                if (delta == 0) {
                    System.out.println("pt co nghiem kep x1 = x2 = -b/2a = " + (-b / (2 * a)));
                } else {
                    System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
                    System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
                }
            }
        }
    }
}
