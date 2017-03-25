package enums;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class NaiveCalendar {

    private static final Logger LOGGER = LogManager.getLogger(NaiveCalendar.class);

    public static void main(String[] args) {
        System.out.println(DayOfWeek.FRIDAY.name());
        System.out.println(java.time.DayOfWeek.FRIDAY.minus(4));

        for (DayOfWeek dow : DayOfWeek.values()) {
            LOGGER.info(String.format("<%s> %s", dow.name(), describeDay(dow)));
        }
    }

    private static String describeDay(DayOfWeek dow) {
        String description;
        switch (dow) {
            case FRIDAY: {
                description = "It's FRIDAY! Hooray!";
                break;
            }
            case MONDAY: return "Oh now! It's Monday again...";
            case SATURDAY:
            case SUNDAY: return "It's weekend!";
            default: description = "It's a regular work day";
        }
        return description;
    }
}
