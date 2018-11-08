package edu.wctc.eligrow.test;

import edu.wctc.eligrow.BasicCharacter;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class BasicCharacterTest extends TestCase {

    BasicCharacter test;

    @Before
    public void setUp() throws Exception {
       test  = new BasicCharacter("Test");
    }

    @Test
    public void testGetName() {
        assertEquals("Test", test.getName());
    }

    @Test
    public void testGetHealth() {
        assertEquals(0.0, test.getHealth());
    }
}