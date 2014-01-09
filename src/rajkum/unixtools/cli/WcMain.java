package rajkum.unixtools.cli;
import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.WC;

import java.io.IOException;

public class WcMain {
    public static void main(String[] args) {
        FileOps file = new FileOps();
        String text = null;
        try {
            text = file.read(args[0]);
        } catch (IOException e) {
            System.err.println("Something went wrong");
        }
        WC ob = new WC();
        ob.Count(text);
        System.out.println(ob.numOfChars + "\t" + ob.numOfWords + "\t" + ob.numOfLines + "\t" + args[0]);
    }
}