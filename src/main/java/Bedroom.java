import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int roomCapacity;
    private String type;
    private ArrayList<Guest> guestsInBedroom;

    public Bedroom(int roomNumber, int roomCapacity, String type){
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.type = type;
        this.guestsInBedroom = new ArrayList<>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getRoomCapacity(){
        return this.roomCapacity;
    }

    public String getRoomType(){
        return this.type;
    }

}
