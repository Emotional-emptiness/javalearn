package EnumTest;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;

public class EnumDemo {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.THURSDAY;
//        workDayOrNot(day);
        System.out.println("DayOfWeek.values() = " + Arrays.toString(DayOfWeek.values()));
        System.out.println("DayOfWeek.valueOf(\"MONDAY\") = " + DayOfWeek.valueOf("MONDAY"));
        System.out.println("DayOfWeek.valueOf(\"SUNDAY\").name() = " + DayOfWeek.valueOf("SUNDAY").name());
        final DayOfWeek friday = DayOfWeek.valueOf("FRIDAY");
        final String name = friday.name();
        final String dayOfWeek = friday.getDayOfWeek();
        final Integer dayInd = friday.getDayIdentifier();
        System.out.println(name + " " + day + " " + dayOfWeek + " " + dayInd);
        day.workDayOrNot();
        EnumSet<DayOfWeek> dayOfWeeks = EnumSet.allOf(DayOfWeek.class);
        System.out.println(dayOfWeeks);
        EnumMap<DayOfWeek, List<String>> dayPlans = new EnumMap<>(DayOfWeek.class);
        dayPlans.put(DayOfWeek.MONDAY, Arrays.asList("Сходить в магазин", "Убрать в комнате", "Пойти гулять"));
        System.out.println(dayPlans);
    }

//    private static void workDayOrNot(DayOfWeek day) {
//        switch (day) {
//            case SUNDAY:
//            case SATURDAY:
//                System.out.println("выходной день");
//                break;
//            case MONDAY:
//            case TUESDAY:
//            case WEDNESDAY:
//            case THURSDAY:
//            case FRIDAY:
//                System.out.println("рабочий день");
//                break;
//            default:
//                System.out.println("wrong day");
//        }
//    }
}
