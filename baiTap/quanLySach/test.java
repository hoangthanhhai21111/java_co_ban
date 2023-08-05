package baiTap.quanLySach;

public class test {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(21, 04, 1999);
        ngay ngay2 = new ngay(21, 04, 2000);
        ngay ngay3 = new ngay(21, 04, 2001);
        tacGia tacgia1 = new tacGia("nguyễn văn a", ngay1);
        tacGia tacgia2 = new tacGia("nguyễn văn b", ngay2);
        tacGia tacgia3 = new tacGia("nguyễn văn c", ngay3);
        sach sach1 = new sach("doremon1", 250000, 2023, tacgia1);
        sach sach2 = new sach("doremon2", 234000, 2021, tacgia2);
        sach sach3 = new sach("doremon3", 233000, 2023, tacgia3);
        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();
        System.out.println(sach1.kiemtracungnamxuatban(sach3));
        System.out.println(sach1.kiemtracungnamxuatban(sach2));
        System.out.println(sach1.giasaukhigiam(10));
        System.out.println(sach2.giasaukhigiam(20));
        System.out.println(sach3.giasaukhigiam(30));

    }

}
