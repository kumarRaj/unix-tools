package rajkum.unixtools.lib;


public class ReduceBlanks {
    public String removeSpaces(String text){
        return text.replaceAll("[ ]+"," ");
    }
}
