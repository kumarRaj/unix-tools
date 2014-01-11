package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.ReduceBlanks;

import java.io.IOException;

public class ReduceBlanksMain {
    public static void main(String[] args) {
        try {
            String fileName = args[0];
            String text = new FileOps().read(fileName);
            text = new ReduceBlanks().removeSpaces(text);
            new FileOps().write(fileName, text);
        } catch (IOException e) {
            System.err.println("Sorry something went wrong");
        }
    }

}
