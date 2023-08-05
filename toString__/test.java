package toString__;

public class test {
    public static void main(String[] args) {
        myDate md = new myDate(12, 12, 1233);
        myDate md1 = new myDate(10, 12, 2020);
        myDate md2 = new myDate(14, 12, 2011);
       System.out.println(md);
    //    sữ dụng hàm equals
        System.out.println(md1.equals(md2));
    }
}
