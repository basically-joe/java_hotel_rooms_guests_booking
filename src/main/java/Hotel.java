import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> guestsInHotel;

    public Hotel(String name){
        this.name=name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.guestsInHotel = new ArrayList<>();

    }

    public String getName(){
        return this.name;
    }
}
