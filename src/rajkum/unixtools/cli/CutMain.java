package rajkum.unixtools.cli;

import rajkum.unixtools.lib.Cut;
import rajkum.unixtools.lib.FileOps;

public class CutMain {
    public static void main(String[] args) {
        String text = null;
        try {
            text = new FileOps().read(args[0]);
            System.out.println(new Cut().cutLines(text, Integer.parseInt(args[1]), args[2]));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(new Cut().cutLines(text, Integer.parseInt(args[1])));
        } catch (Exception e) {
            System.err.println("Sorry,Something went wrong. Please try again");
        }
    }

}
