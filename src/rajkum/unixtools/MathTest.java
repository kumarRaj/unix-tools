package rajkum.unixtools;

import static org.junit.Assert.assertEquals;

public class MathTest {
    @org.junit.Test
    public void testAdd() throws Exception {
        Math ab = new Math();
        int expected = 68;

        int sum = ab.add(23, 45);

        assertEquals(expected, sum);
    }
}
