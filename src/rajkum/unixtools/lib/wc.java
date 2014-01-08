package rajkum.unixtools.lib;

import java.io.*;

class WC {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String currentLine;
        int numOfLines = 0, numOfWords = 0, numOfChars = 0;
        while (!((currentLine = br.readLine()) == null)) {
            numOfChars += currentLine.length();
            numOfWords += currentLine.split("\\W").length;
            numOfLines++;
        }
        for (int i = 0; i < 12; i++) System.out.println(i);
        System.out.printf("%d\t%d\t%d\t%s%n", numOfLines, numOfWords, numOfChars, fileName);
    }
}