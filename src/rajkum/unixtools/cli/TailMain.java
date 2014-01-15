package rajkum.unixtools.cli;

import rajkum.unixtools.lib.CLIParser;
import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Tail;

import java.io.IOException;
import java.util.Map;

public class TailMain {
    public static void main(String[] args) {
        String text = null;
        try {
            Map<String, String> input = new CLIParser().getCLIArgs(args);
            text = new FileOps().read(input.get("files"));
            System.out.println(new Tail().getLines(text, Integer.parseInt(input.get("n"))));
        } catch (NumberFormatException ex) {
            System.out.println(new Tail().getLines(text, 10));
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            System.err.println("Sorry,Something went wrong. Please try again");
        }
    }
}
