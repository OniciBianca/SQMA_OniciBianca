import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPrimeNumbers {

    public Math mate;

    @Before
    public void setUp(){
        mate=new Math();
    }

    @Test
    public void testEstePrimCorect() {
        assertTrue(mate.estePrim(17));
        assertFalse(mate.estePrim(16));
    }

    @Test
    public void testEstePrimExceptie() {
        try{
            mate.estePrim(-2);
            fail("Metoda nu arunca exceptie");
        } catch(IllegalArgumentException er){
            er.printStackTrace();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEstePrimNegativExceptie() {
        mate.estePrim(-5);
    }
}
