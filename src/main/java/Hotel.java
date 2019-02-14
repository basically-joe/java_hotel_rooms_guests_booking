import java.util.ArrayList;

public class Hotel {

	private String name;
	private int hotelCapacity;
	private ArrayList<Bedroom> bedrooms;
	private ArrayList<Bedroom> vacantBedrooms;
	private ArrayList<DiningRoom> diningRooms;
	private ArrayList<ConferenceRoom> conferenceRooms;
	private ArrayList<Guest> guestsInHotel;

	public Hotel(String name, int hotelCapacity) {
		this.name = name;
		this.hotelCapacity = hotelCapacity;
		this.bedrooms = new ArrayList<>();
		this.conferenceRooms = new ArrayList<>();
		this.guestsInHotel = new ArrayList<>();
		this.vacantBedrooms = new ArrayList<>();

	}

	public String getName() {
		return this.name;
	}

	public int getGuestCount() {
		return this.guestsInHotel.size();
	}

	public boolean addGuestToRoom(Bedroom bedroomTocheck) {
		for (Bedroom bedroom : this.bedrooms)
			if (bedroom == bedroomTocheck) {
				bedroomTocheck.vacant = false;
			}
		return bedroomTocheck.vacant;

	}

	public void checkInGuest(Bedroom bedroom, Guest guest) {
		addGuestToRoom(bedroom);
		if (getGuestCount() < this.hotelCapacity) {
			this.guestsInHotel.add(guest);
		}
	}

	public void checkOutGuest() {
		this.guestsInHotel.remove(0);
	}

	public int countBedrooms() {
		return this.bedrooms.size();
	}

	public void addBedroom(Bedroom bedroom) {
		this.bedrooms.add(bedroom);
	}

	public int getVacancies() {
		for (Bedroom bedroom : this.bedrooms)
			if (bedroom.getVacancy()) {
				this.vacantBedrooms.add(bedroom);
			}
		return this.vacantBedrooms.size();
	}

	public int chargeCustomer(Guest guest, Bedroom bedroom){
		int total = guest.removeMoneyFromWallet(bedroom.rate);
		 return total;
	}

}




