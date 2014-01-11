package rajkum.unixtools.cli;

import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Head;

public class HeadMain {
    public static void main(String[] args) {
        FileOps file = new FileOps();
        String text = null;
        Head ob = new Head();
        try {
            text = file.read(args[0]);
            System.out.println(ob.getLines(text, Integer.parseInt(args[1])));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ob.getLines(text));
        } catch (Exception e) {
//            e.printStackTrace();
            System.err.println("Sorry,Something went wrong. Please try again");
        }
    }

}
