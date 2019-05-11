import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Flight flight;
    Person passenger;
    Booking booking;

    @Before
    public void setUp(){
        flight = new Flight("FR6826", "Faro", 2);
        passenger = new Person("Ada", "AA789J90");
        booking = new Booking(flight, passenger);
    }

    @Test
    public void hasFlight() {
        assertEquals(flight, booking.getFlight());
    }

    @Test
    public void belongsToAPassenger() {
        assertEquals(passenger, booking.getPassenger());
    }
}
