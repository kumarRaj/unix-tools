package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Uniq;

import java.io.IOException;

public class UniqMain {
    public static void main(String[] args) {
        String text = null;
        try {
            text = new FileOps().read(args[0]);
            System.out.println(new Uniq().getUniqueLines(text));
        } catch (IOException e) {
            System.err.println("Something went wrong");
        }
    }
}
