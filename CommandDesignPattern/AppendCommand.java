package CommandDesignPattern;

import java.util.Scanner;

public class AppendCommand extends Command {
    private Scanner in=new Scanner(System.in);

    public AppendCommand(Document doc) {
        super(doc);
        this.document=doc;
    }

    public String execute() {
        System.out.println("What would you like to append?");
        String line = in.nextLine();
        return document.append(line);
    }
}
