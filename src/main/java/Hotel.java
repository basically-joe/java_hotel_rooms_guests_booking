import java.util.ArrayList;

public class Hotel {

    private String name;
    private int hotelCapacity;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> guestsInHotel;

    public Hotel(String name, int hotelCapacity){
        this.name = name;
        this.hotelCapacity = hotelCapacity;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.guestsInHotel = new ArrayList<>();

    }

    public String getName(){
        return this.name;
    }

    public int getGuestCount(){
        return this.guestsInHotel.size();
    }

    public void checkInGuest(Guest guest){
        if(getGuestCount() < this.hotelCapacity) {
            this.guestsInHotel.add(guest);
        }
    }

    public void checkOutGuest(){
        this.guestsInHotel.remove(0);
    }




}
