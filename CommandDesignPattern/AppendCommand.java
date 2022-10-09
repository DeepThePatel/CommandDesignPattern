package CommandDesignPattern;

import java.util.Scanner;

public class AppendCommand extends Command {
    private Scanner in;

    public AppendCommand(Document doc) {

    }

    public String execute() {
        return "The line has been appended to the document";
    }
}
