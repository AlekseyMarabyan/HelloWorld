package Main;

import Events.FirstEvent;
import org.apache.log4j.Logger;

import java.text.ParseException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {

        Locale.getDefault();
        ResourceBundle res = ResourceBundle.getBundle("bundle");

        FirstEvent firstEvent = FirstEvent.newBuilder().buld();

        String events = null;

        try {
            events = firstEvent.getFirstEvent();
        }catch (ParseException e){
            log.error("Parse exception", e);
        }


        if (events != null){
            switch (events) {
                case "MORNING":
                    System.out.println(res.getString("1"));
                    log.info("Print morning message");
                    break;
                case "DAY":
                    System.out.println(res.getString("2"));
                    log.info("Print day message");
                    break;
                case "EVENING":
                    System.out.println(res.getString("3"));
                    log.info("Print evening message");
                    break;
                case "NIGHT":
                    System.out.println(res.getString("4"));
                    log.info("Print night message");
                    break;
            }
        }else log.warn("Events equals null");

    }
}


