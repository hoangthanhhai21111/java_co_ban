package baiTap.quanLySinhVien;

public class sinhVien {
    private String maSV, ten;
    private ngay ngaySinh; 
    private Float diem;
    private lop lop;
    sinhVien(String maSV, String ten, ngay ngaySinh, Float diem, lop lop) {
        this.maSV = maSV;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
        this.lop = lop;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getTen() {
        return ten;
    }
    public void setNgaySinh(ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public ngay getNgaySinh() {
        return ngaySinh;
    }
    public void setDiem(float diem) {
        this.diem = diem;
    }
    public float getDiem() {
        return diem;
    }
    public void setLop(lop lop) {
        this.lop = lop;
    }
    public lop getLop() {
        return lop;
    }
    public String layTenKhoa(){
        return this.lop.getTenKhoa();
    }
    public boolean kiemTraDiem(){
        return this.diem>=5.0;
    }
    public boolean kiemTraCungNgaySinh(sinhVien sinhVien){
      return this.ngaySinh.equals(sinhVien.ngaySinh);
    }
}
