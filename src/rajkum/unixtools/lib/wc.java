package rajkum.unixtools.lib;

public class WC {
    public int numOfLines = 0, numOfWords = 0, numOfChars = 0;

    public void Count(String data) {
        this.numOfLines = data.split("\\n | \\r\\n").length;
        this.numOfWords = data.split("\\W").length;
        this.numOfChars = data.length();
    }
}