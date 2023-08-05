package baiTap.quanLyRapChieuPhim;

public class test {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(21, 04, 1999);
        ngay ngay2 = new ngay(25, 06, 2001);
        ngay ngay3 = new ngay(11, 12, 2011);

        hangSanXuat hang1 = new hangSanXuat("doremon", "Viet Nam");
        hangSanXuat hang2 = new hangSanXuat("naruto", "Nhat Ban");
        hangSanXuat hang3 = new hangSanXuat("Hoang Hai", "Viet Nam");

        boPhim phim1 = new boPhim("phim1", 2011, hang1, 20000, ngay1);
        boPhim phim2 = new boPhim("phim2", 2025, hang2, 30000, ngay2);
        boPhim phim3 = new boPhim("phim3", 2023, hang3, 40000, ngay3);

        System.out.println(phim1.kiemTraGiaVe(phim2));
        System.out.println(phim2.kiemTraGiaVe(phim3));

        System.out.println(phim1.tenHangSanXuat());
        System.out.println(phim2.tenHangSanXuat());
        System.out.println(phim3.tenHangSanXuat());
        
        System.out.println(phim1.giaSauKhiKhuyenMai(10));
        System.out.println(phim2.giaSauKhiKhuyenMai(20));
        System.out.println(phim3.giaSauKhiKhuyenMai(30));

    }
}
