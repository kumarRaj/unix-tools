package rajkum.unixtools.lib;


public class Cut {
    public String cutLines(String data, int fieldNumber, String delimiter) {
        String[] lines;
        StringBuilder result = new StringBuilder("");
        lines = data.split("\n");
        fieldNumber = fieldNumber - 1;
        if (!data.contains(delimiter))
            return data;
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(delimiter);
            if (fieldNumber < words.length) {
                result.append(words[fieldNumber]).append("\n");
            } else result.append("").append("\n");
        }
        return result.toString();
    }

    public String cutLines(String data, int field_no) {
        return cutLines(data, field_no, " ");
    }
}
