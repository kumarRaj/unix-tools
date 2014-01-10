package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.ReduceBlanks;

import java.io.IOException;

public class ReduceBlanksMain {
    public static void main(String[] args) {
        FileOps file = new FileOps();
        ReduceBlanks rc = new ReduceBlanks();
        try {
            String fileName = args[0];
            String text = file.read(fileName);
            text = rc.removeSpaces(text);
            file.write(fileName,text);
        } catch (IOException e) {
            System.err.println("Sorry something went wrong");
        }
    }

}
