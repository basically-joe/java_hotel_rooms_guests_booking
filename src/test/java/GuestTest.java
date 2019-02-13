import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

	Guest guest;

	@Before
	public void before(){
		guest = new Guest("Joe", 500);
	}

	@Test
	public void canGetGuestName(){
		assertEquals("Joe", guest.getGuestName());
	}

	@Test
	public void testGuestHasMoneyInWallet(){
		assertEquals(500, guest.getGuestWalletValue());
	}

}
