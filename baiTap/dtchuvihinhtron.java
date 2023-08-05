package baiTap;

import java.util.Scanner;

public class dtchuvihinhtron {
    public static void main(String[] args) {
        double r, dienTich, chuVi;
        Scanner sc = new Scanner(System.in);
        // System.out.println("nhập bán kính đường tròn: ");
        r = sc.nextDouble();
        dienTich = Math.PI * Math.pow(r, 2);
        // chuVi = 2*Math.PI * r;
        System.out.println("diện tích hình trọn bán kính " + r + "= " + dienTich);
        // System.out.println("chu vi hình trọn bán kính " + r + "= " + chuVi);

    }
    
}
