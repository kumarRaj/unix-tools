package rajkum.unixtools.lib;

public class Head {
    public String getLines(String data, int numOfLines) {
        StringBuilder result = new StringBuilder("");
        String[] lines;
        lines = data.split("\n", numOfLines + 1);
        for (int i = 0; i < numOfLines && i < lines.length; i++) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }
}
