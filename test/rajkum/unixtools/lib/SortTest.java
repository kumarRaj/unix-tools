package rajkum.unixtools.lib;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by rajkum on 1/11/14.
 */
public class SortTest {
    @Test
    public void testGetSortedData() throws Exception {
        String text = "Prateek\nis\na\nfool";
        String expected = "Prateek\na\nfool\nis\n";

        assertEquals(expected, new Sort().getSortedData(text));
    }
}
