package edu.wctc.eligrow.test;

import edu.wctc.eligrow.BasicCharacter;
import edu.wctc.eligrow.Shield;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShieldTest extends TestCase {

    edu.wctc.eligrow.Character test;

    @Before
    public void setUp() throws Exception {
        test = new Shield(new BasicCharacter("Test"));
    }

    @Test
    public void testGetName() {
        assertEquals("Test The Shield Bearer", test.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(15.0, test.getHealth());
    }
}