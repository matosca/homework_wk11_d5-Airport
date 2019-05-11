import java.awt.print.Book;
import java.util.ArrayList;

public class Airport {

    private ArrayList<Hangar> hangars;
    private String airportCode;
    private ArrayList<Flight> flights;
    private ArrayList<Booking> bookings;

    public Airport(String airportCode) {
        this.hangars = new ArrayList<>();
        this.airportCode = airportCode;
        this.flights = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    public int getCountHangars() {
        return hangars.size();
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void addHangarToAirport(Hangar hangar) {
        hangars.add(hangar);
    }


    public void addedFlight(Flight flight) {
        flights.add(flight);
    }

    public int amountOfCreatedFlights() {
        return flights.size();
    }

    public Plane assignedPlaneToFlight(Hangar hangar, Flight flight) {
        Plane planeFromHangar = hangar.getPlaneFromHangar();
        flight.setPlane(planeFromHangar);
        return flight.getPlane();
    }

    public int sellTicket(Person passenger, Hangar hangar, Flight flight) {
        Plane plane = assignedPlaneToFlight(hangar, flight);
        plane.boarding(passenger);
        return plane.getCountOfPassengers();
    }

    public int countBookingsForFlight() {
        return this.bookings.size();
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }


    public boolean handleBookingsForFlight(Person passenger, Flight flight, Hangar hangar, Booking booking) {
        Plane plane = assignedPlaneToFlight(hangar, flight);
        if (plane.getCapacity() > plane.getCountOfPassengers()) {
            hangar.addPlaneInHangar(plane);
            sellTicket(passenger, hangar, flight);
            addBooking(booking);
            return true;
        }
        return false;
    }

    public boolean assignedSuitablePlaneForFlight(Flight flight) {
        for (Hangar hangar : hangars) {
            for (Plane plane : hangar.getPlanes()) {
                if (plane.getCapacity() == flight.getFlightCapacity()) {
                    Plane plane1 = assignedPlaneToFlight(hangar, flight);
                }
            }
        }
        return true;
    }
}
