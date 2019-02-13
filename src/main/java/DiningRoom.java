import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;
    private String typeOfFood;

    public DiningRoom(String name, int capacity, String typeOfFood){
        this.name = name;
        this.capacity = capacity;
        this.typeOfFood = typeOfFood;
    }

    public String getDiningRoomName(){
        return this.name;
    }

    public int getDiningRoomCapacity(){
        return this.capacity;
    }

    public String getTypeOfFood(){
        return this.typeOfFood;
    }
}
