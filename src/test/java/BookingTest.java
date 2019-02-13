import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Booking booking2;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    @Before
    public void before(){
        bedroom = new Bedroom(12, 2, "single", 300, true);
        bedroom2 = new Bedroom(14, 3, "suite", 700, false);
        bedroom3 = new Bedroom(16, 4, "double", 500, true);
        bedroom4 = new Bedroom(18, 1, "single", 250, true);
        booking = new Booking(bedroom, 5);
        booking2 = new Booking(bedroom2, 6);
    }

    @Test
    public void testNumberOfNights(){
        assertEquals(5, booking.getNumberOfNights());
    }

    @Test public void canCreateBookingTest() {
        booking.createBooking(bedroom, 5);
        assertEquals(5, booking.getNumberOfNights());
    }

    @Test
    public void cannotCreateBookingTest(){
        booking.createBooking(bedroom2, 7);
        assertEquals(6, booking2.getNumberOfNights());
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(1500, booking.getBookingBill());
    }



}
