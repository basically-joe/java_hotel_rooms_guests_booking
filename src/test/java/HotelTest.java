import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Guest guest;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    Bedroom bedroom4;

    @Before
    public void before(){
        hotel = new Hotel("Hotel Shmotel", 1000);
        guest = new Guest("Joe", 500);
        bedroom = new Bedroom(12, 2, "single", 300, true);
        bedroom2 = new Bedroom(14, 3, "suite", 700, false);
        bedroom3 = new Bedroom(16, 4, "double", 500, true);
        bedroom4 = new Bedroom(18, 1, "single", 250, true);

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
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, hotel.getGuestCount());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, hotel.getGuestCount());
        hotel.checkOutGuest();
        assertEquals(0,hotel.getGuestCount());
    }

    @Test
    public void checkInGuestsUpToCapacity(){
        for (int i = 0; i < 1100; i++){
            hotel.checkInGuest(bedroom, guest);
        }
        assertEquals(1000, hotel.getGuestCount());
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.countBedrooms());
    }
    @Test
    public void checkBedroomVacancies(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.addBedroom(bedroom4);
        assertEquals(3, hotel.getVacancies());
    }

    @Test
    public void testAddGuestToRoom(){
        hotel.addGuestToRoom(bedroom2);
        assertEquals(true, bedroom.getVacancy());
    }

}
