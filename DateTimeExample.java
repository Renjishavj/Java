import java.util.Date;
import java.util.Calendar;

public class DateTimeExample {
    public static void main(String[] args) {
       
        Date date = new Date();
        System.out.println("Current Date: " + date);

       
        Calendar calendar = Calendar.getInstance();
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH )); //index start from 0
        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
    }
}
