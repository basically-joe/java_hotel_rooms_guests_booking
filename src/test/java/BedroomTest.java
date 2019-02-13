import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(12, 2, "double", 100, true);
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(12, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getRoomCapacity());
    }

    @Test
    public void hasType(){
        assertEquals("double", bedroom.getRoomType());
    }

    @Test
    public void hasRate(){
        assertEquals(100, bedroom.getRoomRate());
    }

    @Test
    public void testIsVacant(){
        assertEquals(true, bedroom.getVacancy());
    }

}
