import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Guest guest;

    @Before
    public void before(){
        hotel = new Hotel("Hotel Shmotel", 1000);
        guest = new Guest();
    }

    @Test
    public void hasName(){
        assertEquals("Hotel Shmotel", hotel.getName());
    }

    @Test
    public void canCheckGuestCount(){
        assertEquals(0, hotel.getGuestCount());
    }

    @Test
    public void canCheckInGuest(){
        hotel.checkInGuest(guest);
        assertEquals(1, hotel.getGuestCount());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkInGuest(guest);
        assertEquals(1, hotel.getGuestCount());
        hotel.checkOutGuest();
        assertEquals(0,hotel.getGuestCount());
    }

    @Test
    public void checkInGuestsUpToCapacity(){
        for (int i = 0; i < 1100; i++){
            hotel.checkInGuest(guest);
        }
        assertEquals(1000, hotel.getGuestCount());
    }

}
