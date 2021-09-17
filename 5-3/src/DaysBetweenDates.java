import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @date: 2021-5-6, 10:56
 * @author: ShiShc
 */

public class DaysBetweenDates {
    public int f(String date1, String date2){

        // 两个日期中相差的天数
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);

        return Math.abs((int) ChronoUnit.DAYS.between(d1, d2));
    }


    public static void main(String[] args) {
        System.out.println(new DaysBetweenDates().f("2019-06-29", "2019-06-30"));
    }
}
