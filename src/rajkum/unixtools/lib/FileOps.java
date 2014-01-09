package rajkum.unixtools.lib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOps {
    String line, text = "";

    public String read(String fileName) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null) text += "\\r\\n" + line;
            return text;
    }
}
