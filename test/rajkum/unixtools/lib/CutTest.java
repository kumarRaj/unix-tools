package rajkum.unixtools.lib;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CutTest {
    @Test
    public void testCutLines() throws Exception {
        Cut ob = new Cut();
        String expected = "abhiu\nKabhiu\nAditiu\n";
        String input = "Abhi abhiu\nKabhi Kabhiu\nAditi Aditiu\n";

        String actual = ob.cutLines(input,2);

        assertEquals(expected, actual);
    }
    @Test
    public void testCutLinesWithDifferentInputs() throws Exception {
        Cut ob = new Cut();
        String expected = "Abhi\nKabhi\nAditi\n";
        String input = "Abhi\tabhiu\nKabhi\tKabhiu\nAditi\tAditiu\n";
        String actual = ob.cutLines(input,1,"\t");

        assertEquals(expected, actual);
    }
    @Test
    public void testCutLinesWithcomma() throws Exception {
        Cut ob = new Cut();
        String input = "Abhi abhiu\nKabhi Kabhiu\nAditi Aditiu\n";
        String expected = input;

        String actual = ob.cutLines(input,2,",");

        assertEquals(expected, actual);
    }

}






