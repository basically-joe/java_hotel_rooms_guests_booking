import java.util.ArrayList;

public class Booking {
    private ArrayList<Bedroom> listOfBedrooms;
    private int numberOfNights;

    public Booking(int numberOfNights){
        this.listOfBedrooms = new ArrayList<>();
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public int getNumberOfBedrooms(){
        return this.listOfBedrooms.size();
    }
}
