import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Hangar hangar;
    Flight flight;
    Plane plane;
    Plane plane1;
    Person passenger;
    Person passenger1;
    Person passenger2;
    Person passenger3;
    Person passenger4;
    Person passenger5;
    Booking booking1;
    Booking booking2;
    Booking booking3;
    Booking booking4;
    Booking booking5;
    Booking booking6;

    @Before
    public void setUp() {
        airport = new Airport("EDI");
        hangar = new Hangar("EDI42");
        flight = new Flight("FR6826", "Faro", 2);
        plane = new Plane(PlaneType.BOING, "Ryanair", 5);
        plane1 = new Plane(PlaneType.AIRBUS, "EasyJet", 2);
        passenger = new Person("Ada", "AA789J90");
        passenger1 = new Person("Joe", "HH229J90");
        passenger2 = new Person("Fernando", "FA229J90");
        passenger3 = new Person("Peter", "AH789J90");
        passenger4 = new Person("Vicky", "LM639J90");
        passenger5 = new Person("Marco", "JP000090");
        booking1 = new Booking(flight, passenger);
        booking2 = new Booking(flight, passenger1);
        booking3 = new Booking(flight, passenger2);
        booking4 = new Booking(flight, passenger3);
        booking5 = new Booking(flight, passenger4);
        booking6 = new Booking(flight, passenger5);
    }

    @Test
    public void hasAnAirportCode() {
        assertEquals("EDI", airport.getAirportCode());
    }

    @Test
    public void hasNotHangars() {
        assertEquals(0, airport.getCountHangars());
    }

    @Test
    public void hasHangars() {
        airport.addHangarToAirport(hangar);
        assertEquals(1, airport.getCountHangars());
    }

    @Test
    public void hasNotCreatedFlightsYet() {
        assertEquals(0, airport.amountOfCreatedFlights());
    }

    @Test
    public void canCreateAFlights() {
        airport.addedFlight(flight);
        assertEquals(1, airport.amountOfCreatedFlights());
    }

    @Test
    public void canAssignedAPlaneToAFlight() {
        hangar.addPlaneInHangar(plane);
        assertEquals(plane, airport.assignedPlaneToFlight(hangar, flight));
    }

    @Test
    public void canSellTicketForFlight() {
        hangar.addPlaneInHangar(plane);
        assertEquals(1, airport.sellTicket(passenger, hangar, flight));
    }

    @Test
    public void canKeepTrackOfBookings() {
        assertEquals(0, airport.countBookingsForFlight());
    }

    @Test
    public void canStartAddingBookings() {
        airport.addBooking(booking1);
        airport.addBooking(booking2);
        assertEquals(2, airport.countBookingsForFlight());
    }

    @Test
    public void canHandleBookingsForFlights() {
        hangar.addPlaneInHangar(plane);
        assertEquals(true, airport.handleBookingsForFlight(passenger, flight, hangar, booking1));
    }

    @Test
    public void canNotHandleBookingsForFullFlights() {
        hangar.addPlaneInHangar(plane);
        airport.sellTicket(passenger, hangar, flight);
        hangar.addPlaneInHangar(plane);
        airport.sellTicket(passenger1, hangar, flight);
        hangar.addPlaneInHangar(plane);
        airport.sellTicket(passenger2, hangar, flight);
        hangar.addPlaneInHangar(plane);
        airport.sellTicket(passenger3, hangar, flight);
        hangar.addPlaneInHangar(plane);
        airport.sellTicket(passenger4, hangar, flight);
        hangar.addPlaneInHangar(plane);
        assertEquals(false, airport.handleBookingsForFlight(passenger, flight, hangar, booking1));
    }

    @Test
    public void canAssignedAppropriatePlanesForSmallFlights() {
        hangar.addPlaneInHangar(plane);
        hangar.addPlaneInHangar(plane1);
        airport.addHangarToAirport(hangar);
        hangar.addPlaneInHangar(plane);
        assertEquals(true, airport.assignedSuitablePlaneForFlight(flight));
    }


}
