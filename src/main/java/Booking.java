import java.util.ArrayList;

public class Booking {

    private Bedroom bedroom;
    public int numberOfNights;
    private ArrayList<Booking> bookings;

    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
        this.bookings = new ArrayList<>();
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public Booking createBooking(Bedroom newBedroom, int numberNights) {
        return new Booking(newBedroom, numberNights);
    }

    public int getBookingBill() {
        int rate = this.bedroom.getRoomRate();
        return this.numberOfNights * rate;
    }
}
