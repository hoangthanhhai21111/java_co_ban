package set_Get;

public class ViDu {
    private int day , month , year;
     
    ViDu(int d , int m , int y){
       if(d>=1 && d<=30){
       this.day = d;
    }
    
    }
    ///lây giá trị của day
    public int getDay() {
        return day;
    }
    // gán giá trị cho day
   public void setDay(int day) {
    if(day>=1 && day<=30){
       this.day = day;
    }
    // tương tự cho month và year
   }
}
