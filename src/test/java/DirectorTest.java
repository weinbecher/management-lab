import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Jimmy","HI",0.0, "Bread Boy", 20.0);
    }

    @Test
    public void hasName(){
        assertEquals("Jimmy", director.getName());
    }


    @Test
    public void hasNiNumber(){
        assertEquals("HI", director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(0.0,director.getSalary(),0.1);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Bread Boy",director.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        director.salaryRaise(10);
        assertEquals(0.0, director.getSalary(), 0.1);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(0.0, director.payBonus(),0.1);
    }

}
