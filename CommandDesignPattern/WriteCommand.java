package CommandDesignPattern;

import java.util.Scanner;
import javax.print.Doc;

public class WriteCommand extends Command{
    private Scanner in;

    public WriteCommand(Document doc) {
        super(doc);
        doc.write(in);
    }

    public String execute() {
        return "The line was written to the file";
    }
}
