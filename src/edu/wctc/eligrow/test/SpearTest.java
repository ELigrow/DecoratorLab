package edu.wctc.eligrow.test;

import edu.wctc.eligrow.BasicCharacter;
import edu.wctc.eligrow.Spear;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpearTest extends TestCase {

    edu.wctc.eligrow.Character test;

    @Before
    public void setUp() throws Exception {
        test = new Spear(new BasicCharacter("Test"));
    }

    @Test
    public void testGetName() {
        assertEquals("Test The Spear Thrower", test.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(5.0, test.getHealth());
    }
}