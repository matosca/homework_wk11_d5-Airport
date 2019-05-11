public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private int flightCapacity;

    public Flight(String flightNumber, String destination, int flightCapacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.plane = plane;
        this.flightCapacity = flightCapacity;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightCapacity() {
        return this.flightCapacity;
    }
}
