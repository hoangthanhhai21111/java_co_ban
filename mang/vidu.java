package mang;

import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        double mang1[]= new double[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < mang1.length;i++){
            System.out.println("nhap gia tri "+i+" cua mang: ");mang1[i] = sc.nextDouble();
            
        }
        double tong = 0;
        for(int i=0; i < mang1.length;i++){
            tong += mang1[i];
        }
        // System.out.println(mang1);
        System.out.println("tong gia trij cuar mang la: "+ tong);
        double mang2[]= new double[]{1,3,4,5};


    }
}
