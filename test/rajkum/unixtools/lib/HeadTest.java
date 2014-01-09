package rajkum.unixtools.lib;

import junit.framework.TestCase;
import org.junit.Test;

public class HeadTest extends TestCase {
    @Test
    public void testGetLines() throws Exception {
        Head ob = new Head();

        ob.getLines("Kunal is\n great");

        assertEquals(2, ob.lines.length);
    }

    @Test
    public void testGetLinesFor2Lines() throws Exception {
        Head ob = new Head();

        ob.getLines("Kunal\n is\n great\nrea",2);

        assertEquals(2, ob.lines.length);
    }
    public void testGetFirst10Lines() throws Exception {
        String data = "Kunal\n is\n great\nrea\ndsq\nswq\nswqswq\nswq\nswq\ndqwqwd\ndqwdw";
        Head ob = new Head();

        ob.getLines(data);

        assertEquals(10, ob.lines.length);
    }
}
