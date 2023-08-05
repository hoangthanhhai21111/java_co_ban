package PhuongThuc;

public class tinhTien {
    private String tenLoaiCafe;
    private double giaTien;
    private double khoiLuong;
    tinhTien(String ten , double gia , double khoiLuong){
        this.tenLoaiCafe = ten;
        this.giaTien = gia;
        this.khoiLuong = khoiLuong;
    }
    double Tien(){
        return this.giaTien * this.khoiLuong;
    }
    double khuyenMai(){
        if(this.Tien() > 500000){
            return this.Tien() / 100 * 10;
        }else{
            return 0;
        } 
    }
    double tienPhaiTra(){
        return this.Tien() - this.khuyenMai();
    }
}
