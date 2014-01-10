package rajkum.unixtools.lib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileOps {
    StringBuilder text = new StringBuilder("");
    String line;
    public String read(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        while ((line = br.readLine()) != null)
            text.append(line).append("\n");
        return text.toString();
    }
}