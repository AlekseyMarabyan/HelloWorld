package Events;

public enum Constatnt {


    MORNING("06:00:00"),
    DAY("09:00:00"),
    EVENING("19:00:00"),
    NIGHT("23:00:00");

    @Override
    public String toString() {
        return time;
    }

    private final String time;

    Constatnt(String time) {
        this.time = time;
    }



}
