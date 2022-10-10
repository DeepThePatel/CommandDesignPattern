package CommandDesignPattern;

import java.util.Scanner;
import javax.print.Doc;

public class WriteCommand extends Command{
    private Scanner in = new Scanner(System.in);

    public WriteCommand(Document doc) {
        super(doc);
        this.document=doc;
    }

    public String execute() {
        System.out.println("What would you like to add?");
        String line = in.nextLine();
        return (document.write(line));
    }
}
