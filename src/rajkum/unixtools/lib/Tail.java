package rajkum.unixtools.lib;

public class Tail {
    public String getLines(String data, int numOfLines) {
        StringBuilder result = new StringBuilder("");
        String[] lines;
        lines = data.split("\n");
        int i;
        if (numOfLines > lines.length)
            i = 0;
        else i = lines.length - numOfLines;
        for (; i < lines.length; i++) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }

    public String getLines(String data) {
        return getLines(data, 10);
    }
}
