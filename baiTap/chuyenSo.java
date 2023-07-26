package baiTap;

import java.util.Scanner;

public class chuyenSo {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số nguyên bất kỳ:");
        n = sc.nextInt();
        String nhiphan = "";
        int a = n;
        while (n > 0) {
            nhiphan = (n % 2) + nhiphan;
            n = n / 2;
        }
        System.out.println("số nhị phân của " + a + " là: " + nhiphan);

    }
}
