package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.WC;

import java.io.IOException;

public class WcMain {
    public static void main(String[] args) {
        String text;
        try {
            text = new FileOps().read(args[0]);
            WC ob = new WC();
            ob.Count(text);
            System.out.println(ob.numOfLines + "\t" + ob.numOfWords + "\t" + ob.numOfChars + "\t" + args[0]);
        } catch (IOException e) {
            System.err.println("Something went wrong");
        }
    }
}