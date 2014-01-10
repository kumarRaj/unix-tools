package rajkum.unixtools.lib;

import java.io.IOException;

public class ReduceBlanks {
    public String removeSpaces(String text){
        String result = text.replaceAll("\\s+"," ");
        return result;
    }
}
