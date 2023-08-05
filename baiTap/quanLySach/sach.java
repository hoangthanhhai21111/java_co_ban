package baiTap.quanLySach;

public class sach {
    private String tenSach;
    private double giaban;
    private int namXuatBan;
    private tacGia tenTacGia;

    sach(String tenSach, double giaban, int namXuat, tacGia tenTacGia) {
        this.tenSach = tenSach;
        this.giaban = giaban;
        this.namXuatBan = namXuat;
        this.tenTacGia = tenTacGia;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public tacGia getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(tacGia tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
    public void inTenSach(){ 
        System.out.println(this.tenSach);
    }
    public boolean kiemtracungnamxuatban(sach sachkhac){
        // if(this.namXuatBan == sachkhac.getNamXuatBan){
        //     return true;
        // }else{
        //     return false;
        // }
        return this.namXuatBan == sachkhac.namXuatBan;
     }
     public double giasaukhigiam(double x){
        return this.giaban / 100 * (100 - x);
     }

}
