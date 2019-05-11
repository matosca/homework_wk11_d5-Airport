public class Booking {

    private Flight flight;
    private Person passenger;

    public Booking(Flight flight, Person passenger) {
        this.flight = flight;
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public Person getPassenger() {
        return passenger;
    }
}
