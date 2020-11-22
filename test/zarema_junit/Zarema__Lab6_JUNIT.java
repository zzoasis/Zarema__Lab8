package zarema_junit;

import org.junit.Test;
import static org.junit.Assert.*;

import static zarema__lab6.Zarema__Lab6.myDiv;

public class  Zarema__Lab6_JUNIT {
    @Test
    public void test1MyDiv() throws Exception {
        assertTrue(myDiv(9, 6, 4) == 304);
        assertTrue(myDiv(8, 7,5) == 565);
        
    }

    @Test
    public void test2MyDiv() throws Exception { 
        try {
            assertTrue("Проверка деления 2 на 0", myDiv(2, 0, 0) == 0);
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
        try {
            assertTrue("Проверка деления 0 на 0", myDiv(0, 0, 0) == 0);
        } catch (Exception thrown) {
            assertNotEquals("", thrown.getMessage());
        }
    }

}