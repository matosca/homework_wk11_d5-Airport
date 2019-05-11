import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Plane plane1;

    @Before
    public void setUp() {
        flight = new Flight("FR6826", "Faro", 2);
        plane = new Plane(PlaneType.BOING, "Ryanair", 5);
        plane1 = new Plane(PlaneType.AIRBUS, "EasyJet", 5);
    }

    @Test
    public void hasPlaneAssigned() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canSetNewPlaneAssigned() {
        flight.setPlane(plane1);
        assertEquals(plane1, flight.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("FR6826", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("Faro", flight.getDestination());
    }

    @Test
    public void hasAFlightCapacity() {
        assertEquals(2, flight.getFlightCapacity());
    }
}
