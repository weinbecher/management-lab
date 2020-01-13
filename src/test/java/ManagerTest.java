import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bobby","HV936500X",120000.0,"Banana Bread");
    }

    @Test
    public void hasName(){
        assertEquals("Bobby", manager.getName());
    }


    @Test
    public void hasNiNumber(){
        assertEquals("HV936500X", manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(120000.0,manager.getSalary(),0.1);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Banana Bread",manager.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        manager.salaryRaise(10);
        assertEquals(132000.0, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetPayBonus(){
        assertEquals(1200.0, manager.payBonus(),0.1);
    }

}
