package rajkum.unixtools.lib;

public class Tail {
    public String getLines(String data, int numOfLines) {
        StringBuilder result = new StringBuilder("");
        String[] lines;
        lines = data.split("\n");
        for (int i = lines.length - 1; i > lines.length - numOfLines && i > 0; i--) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }

    public String getLines(String data) {
        StringBuilder result = new StringBuilder("");
        String[] lines;
        lines = data.split("\n");
        for (int i = lines.length - 1; i > lines.length - 11 && i > 0; i--) {
            result.append(lines[i]).append("\n");
        }
        return result.toString();
    }
}
