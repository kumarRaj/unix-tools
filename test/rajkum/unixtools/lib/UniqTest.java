package rajkum.unixtools.lib;

import junit.framework.TestCase;

public class UniqTest extends TestCase {
    public void testGetUniqueLines() throws Exception {
        String text = "Ram\nSam\nSam\nTum\nTum\nlove";
        String expected = "Ram\nSam\nTum\nlove\n";

        Uniq uniq = new Uniq();
        assertEquals(expected,uniq.getUniqueLines(text));
    }
}
