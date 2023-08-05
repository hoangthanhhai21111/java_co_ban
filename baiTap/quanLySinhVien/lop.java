package baiTap.quanLySinhVien;

public class lop {
    private String tenLop, tenKhoa;
    lop(String tenLop , String tenKhoa){
        this.tenLop= tenLop;
        this.tenKhoa= tenKhoa;
    }
    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
    public String getTenKhoa() {
        return tenKhoa;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public String getTenLop() {
        return tenLop;
    }
    
}
