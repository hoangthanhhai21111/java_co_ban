package ganDuLieu;

import java.util.Scanner;

public class vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập a = ");
        float a = sc.nextFloat();
        System.out.println("a = " + a);
        System.out.println("a+=3 : " + (a += 3));

    }
}