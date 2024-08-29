import java.util.Calendar;

public class day {
    public static void main(String[] args) {
        String day;
        int dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                day = "Sunday";
                break;
            case Calendar.MONDAY:
                day = "Monday";
                break;
            case Calendar.TUESDAY:
                day = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                day = "Wednesday";
                break;
            case Calendar.THURSDAY:
                day = "Thursday";
                break;
            case Calendar.FRIDAY:
                day = "Friday";
                break;
            case Calendar.SATURDAY:
                day = "Saturday";
                break;
            default:
                day = "Invalid day";
                break;
        }

        System.out.println("Today is " + day);
    }
}
