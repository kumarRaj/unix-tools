package rajkum.unixtools.lib;

import java.util.Arrays;

/**
 * Created by rajkum on 1/11/14.
 */
public class Sort {
    public String getSortedData(String text) {
        StringBuilder result = new StringBuilder("");
        String lines[] = text.split("\n");
        Arrays.sort(lines);
        for (String line : lines) {
            result.append(line).append("\n");
        }
        return result.toString();
    }
}
