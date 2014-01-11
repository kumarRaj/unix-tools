package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Head;

public class HeadMain {
    public static void main(String[] args) {
        String text = null;
        try {
            text = new FileOps().read(args[0]);
            System.out.println(new Head().getLines(text, Integer.parseInt(args[1])));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(new Head().getLines(text));
        } catch (Exception e) {
            System.err.println("Sorry,Something went wrong. Please try again");
        }
    }

}
