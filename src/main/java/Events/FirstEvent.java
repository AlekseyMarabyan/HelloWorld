package Events;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class FirstEvent {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private static Logger log = Logger.getLogger(FirstEvent.class);

    private Date current;
    private Date currentDate;

    private Date morning;
    private Date day;
    private Date evening;
    private Date night;

    private FirstEvent() {
        currentDate = new Date();
    }

    private FirstEvent(String ev) throws ParseException {
        currentDate = dateFormat.parse(ev);
    }

    public String getFirstEvent() throws ParseException {
        current = dateFormat.parse(dateFormat.format(currentDate));
        morning = dateFormat.parse(Constatnt.MORNING.toString());
        day = dateFormat.parse(Constatnt.DAY.toString());
        evening = dateFormat.parse(Constatnt.EVENING.toString());
        night = dateFormat.parse(Constatnt.NIGHT.toString());

        if (current.after(morning) && current.before(day)) {
            log.info("Print --> Good morning , World !");
            return "MORNING";
        } else if (current.after(day) && current.before(evening)) {
            log.info("Print --> Good day, World!");
            return "DAY";
        } else if (current.after(evening) && current.before(night)) {
            log.info("Print --> Good evening, World!");
            return "EVENING";
        } else
            log.info("Print --> Good night, World!");
        return "NIGHT";

    }

    //Старался придерживаться ООП , но тут не могу сходу придумать как его переписать по другому(.

    public static Builder newBuilder(String ev) throws ParseException {
        return new FirstEvent(ev).new Builder();
    }

    public static Builder newBuilder() {
        return new FirstEvent().new Builder();
    }


    public class Builder {

        public Builder() {

        }

        public FirstEvent buld() {
            return FirstEvent.this;
        }

    }


}
