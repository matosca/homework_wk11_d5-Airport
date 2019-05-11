import java.util.ArrayList;

public class Hangar {

    private String name;
    private ArrayList<Plane> planes;

    public Hangar(String name) {
        this.name = name;
        this.planes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Plane> getPlanes() {
        return this.planes;
    }

    public int getCountPlanes() {
        return planes.size();
    }

    public void addPlaneInHangar(Plane plane) {
        planes.add(plane);
    }

    public Plane getPlaneFromHangar() {
        return this.planes.remove(0);
    }
}
