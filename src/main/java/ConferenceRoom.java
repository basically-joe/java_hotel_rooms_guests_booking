import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guestsInConferenceRoom;
    private boolean tvEquipment;


    public ConferenceRoom(String name, int capacity, boolean tvEquipment) {
        this.name = name;
        this.capacity = capacity;
        this.tvEquipment = tvEquipment;
        this.guestsInConferenceRoom = new ArrayList<>();
    }

    public String getConferenceRoomName() {
        return this.name;
    }

    public int getConferenceRoomCapacity() {
        return this.capacity;

    }

    public boolean getTVequipment() {
        return this.tvEquipment;
    }

}
