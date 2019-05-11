import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Person passenger1;
    Person passenger2;
    Person passenger3;


    @Before
    public void setUp() {
        plane = new Plane(PlaneType.BOING, "Ryanair", 5);
        passenger1 = new Person("Ada", "AA789J90");
        passenger2 = new Person("Yaiza", "DJ44K908");
        passenger3 = new Person("Ada", "FG569J91");
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOING, plane.getPlaneType(plane));
    }

    @Test
    public void hasAirlineCompany(){
        assertEquals("Ryanair", plane.getAirline());
    }

    @Test
    public void hasNoPassengersOnBoard(){
        assertEquals(0, plane.getCountOfPassengers());
    }

    @Test
    public void hasPassengersOnBoard() {
        plane.boarding(passenger1);
        plane.boarding(passenger2);
        plane.boarding(passenger3);
        assertEquals(3, plane.getCountOfPassengers());
    }

    @Test
    public void hasPassengersCapacity() {
        assertEquals(5, plane.getCapacity());
    }
}
