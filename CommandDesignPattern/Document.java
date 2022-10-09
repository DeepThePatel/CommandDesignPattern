package CommandDesignPattern;
import java.util.ArrayList;

public class Document {
    private String fileName;
    private ArrayList<String> lines = new ArrayList<String>();

    public Document(String fileName) {
        FileManipulator.readFile(fileName);
    }

    public String view() {
        ViewCommand viewCommand = (ViewCommand) new Command();
        return viewCommand.execute();
    }

    public String append(String line) {
        AppendCommand appendCommand = (AppendCommand) new Command();
        return appendCommand.execute();
    }

    public String write(String line) {
        WriteCommand writeCommand = (WriteCommand) new Command();
        return writeCommand.execute();
    }

    public String save() {
        SaveCommand saveCommand = (SaveCommand) new Command();
        return saveCommand.execute();
    }
}
