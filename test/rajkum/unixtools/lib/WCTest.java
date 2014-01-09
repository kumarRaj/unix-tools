package rajkum.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WCTest {
    @Test
    public void testWcWords() throws Exception {
        WC count = new WC();
        count.Count("Kunal is great");
        assertEquals(3, count.numOfWords);
        assertEquals(1, count.numOfLines);
        assertEquals(14, count.numOfChars);
    }
    @Test
    public void testWcLines() throws Exception {
        WC count = new WC();
        count.Count("Kunal is\n great");
        assertEquals(4, count.numOfWords);
        assertEquals(2, count.numOfLines);
        assertEquals(15, count.numOfChars);
    }

}
