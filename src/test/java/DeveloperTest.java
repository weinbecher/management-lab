import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Sophia", "987654321", 60000000.0);
    }

    @Test
    public void hasName(){
        assertEquals("Sophia", developer.getName());
    }


    @Test
    public void hasNiNumber(){
        assertEquals("987654321", developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000000.0, developer.getSalary(),0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.salaryRaise(1);
        assertEquals(60600000.0, developer.getSalary(), 0.1);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(600000.0, developer.payBonus(),0.1);
    }

}
