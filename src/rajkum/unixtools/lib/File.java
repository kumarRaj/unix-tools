package rajkum.unixtools.lib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
    String line, text = "";

    String read(String fileName) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) text += line;
            return text;
    }
}
