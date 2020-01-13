import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bobby","HV936500X",120000.0);
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


}
