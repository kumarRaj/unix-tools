package rajkum.unixtools.lib;

public class Head {
    public String[] lines;
    public void getLines (String data,int numOfLines) {
        this.lines = data.split("\\n", numOfLines);
    }
    public void getLines (String data) {
        this.lines = data.split("\\n",10);
        System.out.println(this.lines);
    }
}
