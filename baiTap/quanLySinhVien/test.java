package baiTap.quanLySinhVien;

public class test {
    public static void main(String[] args) {
        ngay ngay1 = new ngay(21,04,1999);
        ngay ngay2 = new ngay(19,05,2002);
        ngay ngay3 = new ngay(20,06,2001);

        lop lop1 = new lop("lop1", "cntt");        
        lop lop2 = new lop("lop2", "My Thuat");
        lop lop3 = new lop("lop3", "Am Nhac");

        sinhVien sv1 = new sinhVien("sv1", "Hoang Thanh Hai", ngay1 , 7.9f,lop1);        
        sinhVien sv2 = new sinhVien("sv2", "Tran Thi Tinh Nhi", ngay2 , 8.0f, lop2);
        sinhVien sv3 = new sinhVien("sv3", "Nguyen Van C", ngay3 , 4.9f,lop3);
    
        System.out.println("ten khoa sv1 dang hoc là:"+ sv1.layTenKhoa());        
        System.out.println("ten khoa sv2 dang hoc là:"+ sv2.layTenKhoa());
        System.out.println("ten khoa sv3 dang hoc là:"+ sv3.layTenKhoa());

        System.out.println("sinh vien "+ sv1.getTen()+" la: "+sv1.getDiem() + (sv1.kiemTraDiem()?" => dat":" => khong dat"));        
        System.out.println("sinh vien "+ sv2.getTen()+" la: "+sv2.getDiem() + (sv2.kiemTraDiem()?" => dat":" => khong dat"));
        System.out.println("sinh vien "+ sv3.getTen()+" la: "+sv3.getDiem() + (sv3.kiemTraDiem()?" => dat":" => khong dat"));
        
        System.out.println("kiem tra ngay sinh sv1 vs sv2: "+ sv1.kiemTraCungNgaySinh(sv2));        
        System.out.println("kiem tra ngay sinh sv3 vs sv2: "+ sv3.kiemTraCungNgaySinh(sv2));        
        System.out.println("kiem tra ngay sinh sv3 vs sv1: "+ sv3.kiemTraCungNgaySinh(sv1));




    }
}
