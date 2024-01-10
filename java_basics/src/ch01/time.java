package java_basics.src.ch01;


import java.sql.Time;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class time {

    public static void main(String[] args) {
        Time sqlTime = Time.valueOf("08:00:00");
        Time sqlTime2 = Time.valueOf("09:00:00");
      
        System.out.println("diff sqlTime  == " + sqlTime.getTime());
        System.out.println("diff sqlTime2 == " + sqlTime2.getTime());
        System.out.println("diff sqlTime   seconds == " + (sqlTime2.getTime() -sqlTime.getTime()) /1000);
        // Get LocalTime from SQL time
        LocalTime localTime = sqlTime.toLocalTime();
        LocalTime localTime2 = sqlTime2.toLocalTime();
        System.out.println("diff LocalTime seconds == " + localTime.until(localTime2, ChronoUnit.SECONDS));
        // long nanosUntil = localTime.toNanoOfDay() - localTime2.toNanoOfDay();  // no overflow
        // System.out.println(nanosUntil);
    }
}
