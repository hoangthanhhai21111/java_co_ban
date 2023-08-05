package lop;

public class ViDu {
    private int day;
    private int month;
    private int year;

    // public static void main(String[] args) {
    // System.out.println("123");
    // }
    public ViDu(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    void printDay() {
        System.out.println(this.day);
    }
}
