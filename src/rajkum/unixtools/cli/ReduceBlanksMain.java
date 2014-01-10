package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.ReduceBlanks;

import java.io.IOException;

public class ReduceBlanksMain {
    public static void main(String[] args) {
        FileOps file = new FileOps();
        ReduceBlanks rc = new ReduceBlanks();
        try {
            String text = file.read(args[0]);
            text = rc.removeSpaces(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
