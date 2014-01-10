package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Uniq;

import java.io.IOException;

public class UniqMain {
    public static void main(String[] args) {
        Uniq ob = new Uniq();
        FileOps file = new FileOps();
        String text = null;
        try {
            text = file.read(args[0]);
        } catch (IOException e) {
            System.err.println("Something went wrong");
        }
        System.out.println(ob.getUniqueLines(text));
    }
}
