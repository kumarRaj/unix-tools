package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Tail;

public class TailMain {
    public static void main(String[] args) {
        FileOps file = new FileOps();
        String text = null;
        Tail ob = new Tail();
        try {
            text = file.read(args[0]);
            System.out.println(ob.getLines(text, Integer.parseInt(args[1]) * -1));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ob.getLines(text));
        } catch (Exception e) {
            System.err.println("Sorry,Something went wrong. Please try again");
        }
    }
}
