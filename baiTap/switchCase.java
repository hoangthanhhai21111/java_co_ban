package baiTap;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        int thu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Thu:");
        thu = sc.nextInt();
        switch (thu) {
            case 2:
                System.out.println("Thu " + thu);
                break;
            case 8:
                System.out.println("chu nhat ");
                break;
            default:
                System.out.println("nhập sai ");
                break;
        }

    }
}
