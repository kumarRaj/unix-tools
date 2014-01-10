package rajkum.unixtools.lib;

/**
 * Created by rajkum on 1/10/14.
 */
public class Cut {
    public String cutLines(String data, int field_no, String delimiter) {
        String[] lines;
        StringBuilder result = new StringBuilder("");
        lines = data.split("\n");
        field_no = field_no - 1;
        if (!data.contains(delimiter))
            return data;
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(delimiter);
            if (field_no < words.length) {
                result.append(words[field_no]).append("\n");
            } else result.append("").append("\n");
        }
        return result.toString();
    }

    public String cutLines(String data, int field_no) {
        Cut cut = new Cut();
        return cut.cutLines(data, field_no, " ");
    }
}
