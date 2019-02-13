import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    @Before
    public void before(){
        booking = new Booking(5);
        bedroom = new Bedroom(12, 2, "single", 300);
        bedroom2 = new Bedroom(14, 3, "suite", 700);
        bedroom3 = new Bedroom(16, 4, "double", 500);
        bedroom4 = new Bedroom(18, 1, "single", 250);
    }

    @Test
    public void testNumberOfNights(){
        assertEquals(5, booking.getNumberOfNights());
    }

    @Test
    public void hasBedrooms(){
        assertEquals(0, booking.getNumberOfBedrooms());
    }



}
