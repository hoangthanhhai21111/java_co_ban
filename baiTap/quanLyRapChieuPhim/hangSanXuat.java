package baiTap.quanLyRapChieuPhim;

public class hangSanXuat {
    private String ten , quocGia;
    hangSanXuat(String ten, String quocGia){
        this.ten = ten;
        this.quocGia = quocGia;
    }
    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
    public String getQuocGia() {
        return quocGia;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        return ten;
    }

}
