package PhuongThuc;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten caffe");
        String LoaiCafe = sc.nextLine();
        System.out.println("nhap gia tien");
        double giaTien = sc.nextDouble();
        System.out.println("nhap gia khoi luong");
        double soLuong = sc.nextDouble();
        tinhTien hd = new tinhTien(LoaiCafe, giaTien, soLuong);
        System.out.println("tien:" + hd.Tien());
        System.out.println("Khuyến mãi:" + hd.khuyenMai());
        System.out.println("cần thanh toán:" + hd.tienPhaiTra());

    }

}
