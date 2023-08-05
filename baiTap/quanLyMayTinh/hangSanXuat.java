package baiTap.quanLyMayTinh;

public class hangSanXuat {
    private String tenHang;
    private quocGia quocGia;

    hangSanXuat(String tenHang, quocGia quocGia) {
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }
    public void setQuocGia(quocGia quocGia) {
        this.quocGia = quocGia;
    }
    public quocGia getQuocGia() {
        return quocGia;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public String getTenHang() {
        return tenHang;
    }
    public String layTenQuocGia() {
        return this.quocGia.getTenQuocGia();
    }

}
