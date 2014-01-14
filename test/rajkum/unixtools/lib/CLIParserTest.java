package rajkum.unixtools.lib;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class CLIParserTest {
    @Test
    public void testGetCLIArgs() throws Exception {
        String args[] = {"-5", "-k1,2", "-c", "-d ", "abra ka dabra", "raj"};
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("5", "5");
        expected.put("k", "1,2");
        expected.put("c", "c");
        expected.put("d", " ");
        expected.put("files", "abra ka dabra,raj");

        Map<String, String> result = new CLIParser().getCLIArgs(args);

        assertEquals(expected, result);
    }

    @Test
    public void testGetCLIArgsNoFileName() throws Exception {
        String args[] = {"-tys"};
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("t", "ys");

        Map<String, String> result = new CLIParser().getCLIArgs(args);

        assertEquals(expected, result);
    }
}
