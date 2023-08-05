package baiTap.quanLyRapChieuPhim;

public class boPhim {
    private String tenPhim;
    private int namSanXuat;
    private hangSanXuat hangSanXuat;
    private double giaVe;
    private ngay ngayChieu;
    boPhim(String tenPhim, int namsanXuat, hangSanXuat hangSanXuat, double giaVe, ngay ngayChieu) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namsanXuat;
        this.hangSanXuat = hangSanXuat;
        this.giaVe = giaVe;
        this.ngayChieu = ngayChieu;
    }
    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }
    public String getTenPhim() {
        return tenPhim;
    }
    public void setNamsanXuat(int namsanXuat) {
        this.namSanXuat = namsanXuat;
    }
    public int getNamsanXuat() {
        return namSanXuat;
    }
    public hangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(hangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }
    public double getGiaVe() {
        return giaVe;
    }
    public void setNgayChieu(ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public ngay getNgayChieu() {
        return ngayChieu;
    }
    public boolean kiemTraGiaVe(boPhim Phim){
        return this.giaVe < Phim.giaVe;
    }
    public String tenHangSanXuat(){
        return this.hangSanXuat.getTen();
    }
    public double giaSauKhiKhuyenMai(double x){
        return this.giaVe/100*(100-x);
    }
}
