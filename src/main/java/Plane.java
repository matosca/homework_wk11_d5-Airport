import java.util.ArrayList;

public class Plane {
    private PlaneType planeType;
    private String airline;
    private ArrayList<Person> passengers;
    private int capacity;

    public Plane(PlaneType planeType, String airline, int capacity) {
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();
        this.capacity = capacity;
    }

    public PlaneType getPlaneType(Plane plane) {
        return planeType;
    }

    public String getAirline() {
        return airline;
    }

    public int getCountOfPassengers() {
        return passengers.size();
    }

    public void boarding(Person passenger) {
        passengers.add(passenger);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
