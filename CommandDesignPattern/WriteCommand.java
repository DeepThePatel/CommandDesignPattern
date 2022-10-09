package CommandDesignPattern;

import java.util.Scanner;
import javax.print.Doc;

public class WriteCommand {
    private Scanner in;

    public WriteCommand(Document doc) {

    }

    public String execute() {
        return "The line was written to the file";
    }
}
