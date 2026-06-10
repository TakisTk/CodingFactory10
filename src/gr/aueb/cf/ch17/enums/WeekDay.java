package gr.aueb.cf.ch17.enums;

public enum WeekDay {
    SUNDAY("Κυριακή"),
    MONDAY("Δευτέρα"),
    TUESDAY("Τρίτη"),
    THURSDAY("Τετάρτη"),
    FRIDAY("Πέμπτη"),
    SATURDAY("Σάββατο");

    private final String day;

    WeekDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }


}
