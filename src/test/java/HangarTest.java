import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar;
    Plane plane;

    @Before
    public void setUp() {
        hangar = new Hangar("EDI42");
        plane = new Plane(PlaneType.BOING, "Ryanair", 5);
    }

    @Test
    public void hasName() {
        assertEquals("EDI42", hangar.getName());
    }

    @Test
    public void hasNoPlane() {
        assertEquals(0, hangar.getCountPlanes());
    }

    @Test
    public void hasPlaneInside(){
        hangar.addPlaneInHangar(plane);
        assertEquals(1, hangar.getCountPlanes());
    }

    @Test
    public void canGetPlaneFromHangar() {
        hangar.addPlaneInHangar(plane);
        hangar.getPlaneFromHangar();
        assertEquals(0, hangar.getCountPlanes());
    }
}
