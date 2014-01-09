package rajkum.unixtools.lib;

import junit.framework.TestCase;

/**
 * Created by rajkum on 1/9/14.
 */
public class UniqTest extends TestCase {
    public void testGetUniqueLines() throws Exception {
        String text = "Ram\nSam\nSam\nTam\nTum\nlove";
        String expected = "Ram\nSam\nTum\nlove\n";

        Uniq uniq = new Uniq();
        assertEquals(expected,uniq.getUniqueLines(text));
    }
}
