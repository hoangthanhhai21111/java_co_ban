package baiTap.quanLyMayTinh;

public class test {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(21, 04, 1999);
        ngay ngay2 = new ngay(21, 04, 2100);
        ngay ngay3 = new ngay(21, 04, 1933);

        quocGia QuocGia1 = new quocGia("QG1", "Viet Nam");
        quocGia QuocGia2 = new quocGia("QG2", "Han Quoc");
        quocGia QuocGia3 = new quocGia("QG3", "Nhat Ban");

        hangSanXuat hang1 = new hangSanXuat("VietNamNet", QuocGia1);
        hangSanXuat hang2 = new hangSanXuat("HanNet", QuocGia2);
        hangSanXuat hang3 = new hangSanXuat("NhatNet", QuocGia3);

        mayTinh may1 = new mayTinh(hang1, ngay1, 50000, 12);
        mayTinh may2 = new mayTinh(hang2, ngay2, 60000, 12);
        mayTinh may3 = new mayTinh(hang3, ngay3, 70000, 12);

        System.out.println("kiem tra gia ban");
        System.out.println("may1 vs may2: "+ may1.kiemTraGiaBan(may2));        
        System.out.println("may3 vs may2: "+ may3.kiemTraGiaBan(may2));

        System.out.println("hien thi ten quoc gia san xuat");
        System.out.println("quoc gia san xuat may1: " + may1.hienThiTenQuocGia());        
        System.out.println("quoc gia san xuat may2: " + may2.hienThiTenQuocGia());
        System.out.println("quoc gia san xuat may3: " + may3.hienThiTenQuocGia());

    }
}
