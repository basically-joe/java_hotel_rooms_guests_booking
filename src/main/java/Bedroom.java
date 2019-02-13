import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int roomCapacity;
    private String type;
    private int rate;
    private ArrayList<Guest> guestsInBedroom;

    public Bedroom(int roomNumber, int roomCapacity, String type, int rate){
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.type = type;
        this.rate = rate;
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

    public int getRoomRate(){
        return this.rate;
    }

}
