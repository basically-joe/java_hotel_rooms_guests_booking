import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel("Hotel Shmotel");
    }

    @Test
    public void hasName(){
        assertEquals("Hotel Shmotel", hotel.getName());
    }

}
