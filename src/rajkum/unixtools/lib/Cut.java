package rajkum.unixtools.lib;

public class Cut {

    public String cutLines(String data, int[] fieldNumbers, String delimiter) {
        String[] lines;
        StringBuilder result = new StringBuilder("");
        lines = data.split("\n");
        if (!data.contains(delimiter)) {
            return data;
        }
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(delimiter);
            String line;
            if (words.length == 1)
                line = lines[i];
            else line = getLineWithRequiredFields(words, delimiter, fieldNumbers);
            result.append(line).append("\n");
        }
        return result.toString();
    }

    private String getLineWithRequiredFields(String[] words, String delimiter, int[] fieldNumbers) {
        StringBuilder line = new StringBuilder("");
        for (int fieldNumber : fieldNumbers) {
            fieldNumber--;
            if (fieldNumber >= words.length)
                line.append("");
            else line.append(words[fieldNumber]).append(delimiter);
        }
        if (line.length() > 0) line.setLength(line.length() - 1);
        return line.toString();
    }
}
