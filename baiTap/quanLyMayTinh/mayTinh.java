package baiTap.quanLyMayTinh;

public class mayTinh {
    private hangSanXuat hangSanXuat;
    private ngay ngaySanXuat;
    private double giaBan;
    private int thoiGianBaoHanh;

    mayTinh(hangSanXuat HangSanXuat, ngay ngaySanXuat, double giaBan, int thoiGian) {
        this.hangSanXuat = HangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.giaBan = giaBan;
        this.thoiGianBaoHanh = thoiGian;
    }

    public void setHangSanXuat(hangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setNgaySanXuat(ngay ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public hangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public ngay getNgaySanXuat() {
        return ngaySanXuat;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }
    boolean kiemTraGiaBan(mayTinh may){
        return this.giaBan < may.giaBan;
    }
    public String hienThiTenQuocGia(){
        return this.hangSanXuat.layTenQuocGia();
    }
}
