package rajkum.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ReduceBlanksTest {
    @Test
    public void testRemoveSpaces() throws Exception {
        ReduceBlanks rc = new ReduceBlanks();
        String input = "This line  has many   spaces in it.";
        String expected = "This line has many spaces in it.";

        String result = rc.removeSpaces(input);

        assertEquals(expected, result);
    }

    @Test
    public void testRemoveSpacesMultipleLines() throws Exception {
        ReduceBlanks rc = new ReduceBlanks();
        String input = "This line  has\n many   spaces in it.";
        String expected = "This line has\n many spaces in it.";

        String result = rc.removeSpaces(input);

        assertEquals(expected, result);
    }
}
