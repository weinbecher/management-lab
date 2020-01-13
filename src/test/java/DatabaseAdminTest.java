import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Michael", "123456789", 100.0);
    }

    @Test
    public void hasName(){
        assertEquals("Michael", databaseAdmin.getName());
    }


    @Test
    public void hasNiNumber(){
        assertEquals("123456789", databaseAdmin.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(100.0,databaseAdmin.getSalary(),0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.salaryRaise(1);
        assertEquals(101.0, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1.0, databaseAdmin.payBonus(),0.1);
    }
}
