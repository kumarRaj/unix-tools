package rajkum.unixtools.lib;

import junit.framework.TestCase;
import org.junit.Test;

public class TailTest extends TestCase {
    @Test
    public void testGetLines() throws Exception {
        String data = "Kunal\nis\ngreat\nI\n";
        String expected = "Kunal\nis\ngreat\nI\n";
        Tail ob = new Tail();

        String actual = ob.getLines(data, 10);

        assertEquals(expected, actual);
    }

    @Test
    public void testGet10Lines() throws Exception {
        String data = "Kunal\nis\ngreat\nI\nam\na\nbig\nfan\nof\nhis\ni\nthink\ntooo";
        String expected = "I\n" +
                "am\n" +
                "a\n" +
                "big\n" +
                "fan\n" +
                "of\n" +
                "his\n" +
                "i\n" +
                "think\n" +
                "tooo\n";
        Tail ob = new Tail();

        String actual = ob.getLines(data);

        assertEquals(expected, actual);
    }
}
