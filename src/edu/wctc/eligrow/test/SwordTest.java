package edu.wctc.eligrow.test;

import edu.wctc.eligrow.BasicCharacter;
import edu.wctc.eligrow.Sword;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwordTest extends TestCase {

    edu.wctc.eligrow.Character test;

    @Before
    public void setUp() throws Exception {
        test = new Sword(new BasicCharacter("Test"));
    }

    @Test
    public void testGetName() {
        assertEquals("Test The Sword Handler", test.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(10.0, test.getHealth());
    }
}