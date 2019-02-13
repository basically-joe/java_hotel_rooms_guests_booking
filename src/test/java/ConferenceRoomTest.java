import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom("The Jeffereson Room", 10, true);
    }

    @Test
    public void testRoomHasName() {
        assertEquals("The Jeffereson Room", conferenceRoom.getConferenceRoomName());
    }

    @Test
    public void testRoomHasCapacity() {
        assertEquals(10, conferenceRoom.getConferenceRoomCapacity());
    }

    @Test
    public void testRoomHasTVequipment() {
     assertEquals(true, conferenceRoom.getTVequipment());
    }

}
