package rajkum.unixtools.cli;

import rajkum.unixtools.lib.CLIParser;
import rajkum.unixtools.lib.FileOps;
import rajkum.unixtools.lib.Head;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

public class HeadMain {
    public static void main(String[] args) throws IOException {
        String text = null;
        InputStream confile = null;
        try {
            Map<String, String> input = new CLIParser().getCLIArgs(args);
            text = new FileOps().read(input.get("files"));
            if (null != input.get("n")) {
                System.out.println(new Head().getLines(text, Integer.parseInt(input.get("n"))));
                System.exit(0);
            }
            System.out.println();
            confile = new FileInputStream(System.getProperty("user.home") + "/.head.config");
            Properties properties = new Properties();
            properties.load(confile);
            String value = properties.getProperty("lines");
            System.out.println(new Head().getLines(text, Integer.parseInt(value)));
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(new Head().getLines(text, 10));
        } catch (Exception e) {
            System.err.println("Sorry,Something went wrong. Please try again");
        }
    }

}
