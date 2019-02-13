import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> guests;

    public Hotel(String name){
        this.name=name;

    }

    public String getName(){
        return this.name;
    }
}
