import Events.FirstEvent;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

public class TestingTasks {

    private FirstEvent event;

    @Test
    public void testGetEvents() throws ParseException {
        event = FirstEvent.newBuilder().buld();
        switch (event.getFirstEvent()) {
            case "MORNING":
                break;
            case "DAY":
                break;
            case "EVENING":
                break;
            case "NIGHT":
                break;
            default:
                Assert.fail();
        }
    }


    @Test
    public void testMorningFirst() throws ParseException {
        event = FirstEvent.newBuilder("06:00:01").buld();
        Assert.assertEquals(event.getFirstEvent(), "MORNING");
    }

    @Test
    public void testMorningSecond() throws ParseException {
        event = FirstEvent.newBuilder("07:59:39").buld();
        Assert.assertEquals(event.getFirstEvent(), "MORNING");
    }

    @Test
    public void testMorningThird() throws ParseException {
        event = FirstEvent.newBuilder("078:35:02").buld();
        Assert.assertEquals(event.getFirstEvent(), "MORNING");
    }

    @Test
    public void testMorningFourth() throws ParseException {
        event = FirstEvent.newBuilder("08:00:00").buld();
        Assert.assertEquals(event.getFirstEvent(), "MORNING");
    }

    @Test
    public void testDayFirst() throws ParseException {
        event = FirstEvent.newBuilder("09:00:01").buld();
        Assert.assertEquals(event.getFirstEvent(), "DAY");
    }

    @Test
    public void testDaySecond() throws ParseException {
        event = FirstEvent.newBuilder("16:59:59").buld();
        Assert.assertEquals(event.getFirstEvent(), "DAY");
    }

    @Test
    public void testDayThird() throws ParseException {
        event = FirstEvent.newBuilder("13:35:53").buld();
        Assert.assertEquals(event.getFirstEvent(), "DAY");
    }

    @Test
    public void testDayFourth() throws ParseException {
        event = FirstEvent.newBuilder("16:07:25").buld();
        Assert.assertEquals(event.getFirstEvent(), "DAY");
    }

    @Test
    public void testEveningFirst() throws ParseException {
        event = FirstEvent.newBuilder("19:00:01").buld();
        Assert.assertEquals(event.getFirstEvent(), "EVENING");
    }

    @Test
    public void testEveningSecond() throws ParseException {
        event = FirstEvent.newBuilder("22:59:59").buld();
        Assert.assertEquals(event.getFirstEvent(), "EVENING");
    }

    @Test
    public void testEveningThird() throws ParseException {
        event = FirstEvent.newBuilder("22:25:01").buld();
        Assert.assertEquals(event.getFirstEvent(), "EVENING");
    }

    @Test
    public void testEveningFourth() throws ParseException {
        event = FirstEvent.newBuilder("22:00:00").buld();
        Assert.assertEquals(event.getFirstEvent(), "EVENING");
    }

    @Test
    public void testNightFirst() throws ParseException {
        event = FirstEvent.newBuilder("23:00:00").buld();
        Assert.assertEquals(event.getFirstEvent(), "NIGHT");
    }

    @Test
    public void testNightSecond() throws ParseException {
        event = FirstEvent.newBuilder("05:59:59").buld();
        Assert.assertEquals(event.getFirstEvent(), "NIGHT");
    }

    @Test
    public void testNightThird() throws ParseException {
        event = FirstEvent.newBuilder("23:15:01").buld();
        Assert.assertEquals(event.getFirstEvent(), "NIGHT");
    }

    @Test
    public void testNightFourth() throws ParseException {
        event = FirstEvent.newBuilder("03:00:00").buld();
        Assert.assertEquals(event.getFirstEvent(), "NIGHT");
    }

}