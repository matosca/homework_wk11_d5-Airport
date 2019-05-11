import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person passenger;

    @Before
    public void setUp(){
        passenger = new Person("Ada", "AA789J90");
    }

    @Test
    public void hasName(){
        assertEquals("Ada", passenger.getName());
    }

    @Test
    public void hasPassportNumber(){
        assertEquals("AA789J90", passenger.getPassportNumber());
    }
}
