import java.util.Scanner;

public class ngaySinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ho_ten = sc.nextLine();
        // Tách họ tên thành các từ riêng biệt
        String[] tu = ho_ten.split(" ");
        // In hoa mỗi đầu từ
        String ho_ten_moi = "";
        for (String t : tu) {
            ho_ten_moi += t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase() + " ";
        }
        // In ra họ tên đã được xử lý
        System.out.println(ho_ten_moi.trim());
    }
}
