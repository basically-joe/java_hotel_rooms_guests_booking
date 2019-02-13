import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int roomCapacity;
    private String type;
    public int rate;
    public boolean vacant;
    private ArrayList<Guest> guestsInBedroom;


    public Bedroom(int roomNumber, int roomCapacity, String type, int rate, boolean vacant){
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.type = type;
        this.rate = rate;
        this.vacant = vacant;
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

    public boolean getVacancy() {
        return this.vacant;
    }



}
