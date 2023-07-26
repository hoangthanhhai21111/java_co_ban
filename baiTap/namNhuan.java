package baiTap;

import java.util.Scanner;

public class namNhuan {
    public static void main(String[] args) {
        int thang;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vào tháng:");
        thang = sc.nextInt();
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang co 31 ngay:");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co 30 ngay:");
                break;
            case 2:
                System.out.println("nhập vào năm:");
                int nam = sc.nextInt();
                // if((nam % 400 == 0)||(nam % 400 != 0 && nam % 4 == 0)){
                // System.out.println("thang có 29 ngày:");
                // }else{
                // System.out.println("thang có 28 ngày:")2;
                // }
                if (nam % 400 == 0) {
                    System.out.println("thang có 29 ngày:");
                } else {
                    if (nam % 4 == 0 && nam % 100 != 0) {
                        System.out.println("thang có 29 ngày:");
                    } else {
                        System.out.println("thang có 28 ngày:");
                    }
                }
                break;
            default:
                break;
        }

    }

}
