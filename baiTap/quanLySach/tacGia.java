package baiTap.quanLySach;

public class tacGia {
    private String name ;
    private ngay dayOfBirth;
    tacGia(String name, ngay dayOfBirth) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
    }
    public ngay getDayOfBirth() {
        return dayOfBirth;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
   public void getDayOfBirth(ngay dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
    
}
