package EnumTest;

public enum DayOfWeek {
    SUNDAY("Sunday", 1){
        @Override
        public void workDayOrNot() {
            System.out.println("Выходной день");
        }
    },
    MONDAY("Monday", 2){
        @Override
        public void workDayOrNot() {
            System.out.println("Рабочий день");
        }
    },
    TUESDAY("Tuesday",3){
        @Override
        public void workDayOrNot() {
            System.out.println("Рабочий день");
        }
    },
    WEDNESDAY("Wednesday",4){
        @Override
        public void workDayOrNot() {
            System.out.println("Рабочий день");
        }
    },
    THURSDAY("Thursday",5){
        @Override
        public void workDayOrNot() {
            System.out.println("Рабочий день");
        }
    },
    FRIDAY("Friday",6){
        @Override
        public void workDayOrNot() {
            System.out.println("Рабочий день");
        }
    },
    SATURDAY("Saturday",7){
        @Override
        public void workDayOrNot() {
            System.out.println("Выходной день");
        }
    };

    private String dayOfWeek;
    private Integer dayIdentifier;

    public Integer getDayIdentifier() {
        return dayIdentifier;
    }

    DayOfWeek(String dayOfWeek, Integer dayIdentifier) {
        this.dayOfWeek = dayOfWeek;
        this.dayIdentifier = dayIdentifier;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public abstract void  workDayOrNot();
}
