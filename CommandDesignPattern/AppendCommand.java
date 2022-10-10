package CommandDesignPattern;

import java.util.Scanner;

public class AppendCommand extends Command {
    private Scanner in=new Scanner(System.in);

    public AppendCommand(Document doc) {
        super(doc);
        this.document=doc;
        System.out.println("What would you like to append?");
        String line = in.nextLine();
        doc.append(line);
    }

    public String execute() {
        return "The line has been appended.";
    }
}
