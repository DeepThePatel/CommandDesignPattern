package CommandDesignPattern;

import java.util.Scanner;
import javax.print.Doc;

public class WriteCommand extends Command{
    private Scanner in = new Scanner(System.in);

    public WriteCommand(Document doc) {
        super(doc);
        this.document=doc;
        System.out.println("What would you like to add?");
        String line = in.nextLine();
        doc.write(line);
        
    }

    public String execute() {
       return "The line has been written to the file.";
    }
}
