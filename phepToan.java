import java.util.Scanner;

public class phepToan {
    public static void main(String[] args) {
        // khai báo biến
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia trị a: ");
        a = sc.nextInt();
        System.out.println("nhap vao b =");
        b = sc.nextInt();
        int tong = a + b;
        System.out.println(a + " + " + b + " = " + tong);
        int hieu = a - b;
        System.out.println(a + " - " + b + " = " + hieu);
        float thuong = (float)a / b;
        System.out.println(a + " / " + b + " = " + thuong);
        int tich = a * b;
        System.out.println(a + " * " + b + " = " + tich);
        int du = a % b;
        System.out.println(a + " % " + b + " = " + du);
    }
}
