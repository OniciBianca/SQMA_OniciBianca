import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPalindromNumbers {
    public Math mate;

    @Before
    public void setUp(){
        mate=new Math();
    }

    @Test
    public void testEstePalindromCorect() {
        assertTrue(mate.estePalindrom(101));
        assertFalse(mate.estePalindrom(16));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEstePAlindromNegativExceptie() {
        mate.estePalindrom(-5);
    }
}
