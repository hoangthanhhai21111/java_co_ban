package baiTap;

public class vaHinh {
    public static void main(String[] args) {
        String x = "   ";
        for (int i = 1; i <= 7; i++) {
            String y = "";
            if (i < 4) {
                for (int j = 0; j < i; j++) {
                    y += "*";
                }
                System.out.println(x + y);
            } else if (i == 4) {
                for (int j = 0; j < 7; j++) {
                    y += "*";
                }
                System.out.println(y);
            } else if (i > 4) {
                    y = "";
                    for (int k = 7; k >=i ; k--) {
                        y += "*";
                } 
                 System.out.println(y);
            }
        }
    }

}
