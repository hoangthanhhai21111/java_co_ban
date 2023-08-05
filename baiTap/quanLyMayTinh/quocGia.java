package baiTap.quanLyMayTinh;

public class quocGia {
    private String maQuocGia, tenQuocGia;

    quocGia(String maQuocGia, String tenQuocGia) {
        this.maQuocGia = maQuocGia;
        this.tenQuocGia = tenQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }

    public String getTenQuocGia() {
        return this.tenQuocGia;
    }
    

}
