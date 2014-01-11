package rajkum.unixtools.cli;


import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Sort;

import java.io.IOException;

public class SortMain {
    public static void main(String[] args) {
        try {
            String text = new FileOps().read(args[0]);
            System.out.println(new Sort().getSortedData(text));
        } catch (IOException e) {
            System.err.println("Sorry Something went wrong");
        }

    }
}
