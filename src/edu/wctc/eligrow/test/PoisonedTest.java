package edu.wctc.eligrow.test;

import edu.wctc.eligrow.BasicCharacter;
import edu.wctc.eligrow.Poisoned;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PoisonedTest extends TestCase {

    edu.wctc.eligrow.Character test;

    @Before
    public void setUp() throws Exception {
        test = new Poisoned(new BasicCharacter("Test"));
    }

    @Test
    public void testGetName() {
        assertEquals("Test The Sickly One", test.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(-10.0, test.getHealth());
    }
}