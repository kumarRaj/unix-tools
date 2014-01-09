package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Head;

import java.io.IOException;

public class HeadMain {
    public static void main(String[] args) {
        FileOps file = new FileOps();
        String text = null;
        try {
            text = file.read(args[0]);
            Head ob = new Head();
            ob.getLines(text);
        } catch (Exception e) {
            System.err.println("Sorry,Something went wrong. Please try again");
        }
        for (String line : ob.lines)
            System.out.println(line);
    }

}
