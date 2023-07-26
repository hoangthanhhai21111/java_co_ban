package baiTap;

import java.util.Scanner;

public class ptBac1 {
    public static void main(String[] args) {
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a:");
        a = sc.nextDouble();
        System.out.println("nhập b:");
        b = sc.nextDouble();
        if(a!=0){
            System.out.println("x = -b/a = "+ (-b/a));
        }else{
            if(b!=0){
                System.out.println("pt vô nghiệm");
            }else{
                System.out.println("pt vô số nghiệm");
            }
        }
    }

}
