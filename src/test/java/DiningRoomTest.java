import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom("Wednesday Room", 100, "Persian");
    }

    @Test
    public void testHasName(){
        assertEquals("Wednesday Room", diningRoom.getDiningRoomName());
    }

    @Test
    public void testHasCapacity(){
        assertEquals(100, diningRoom.getDiningRoomCapacity());
    }

    @Test
    public void testHasTypeOfFood(){
        assertEquals("Persian", diningRoom.getTypeOfFood());
    }
}
