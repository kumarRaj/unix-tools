package rajkum.unixtools.lib;

public class Uniq {
    public String getUniqueLines(String text) {
        StringBuilder result = new StringBuilder("");
        String[] lines;
        lines = text.split("\n");
        result.append(lines[0]).append("\n");
        for (int i = 0; i < lines.length - 1; i++) {
            if (!lines[i].equalsIgnoreCase(lines[i + 1]))
                result.append(lines[i + 1]).append("\n");
        }
        return result.toString();
    }
}
