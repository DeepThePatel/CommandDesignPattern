import java.util.Scanner;

public class WriteCommand extends Command{
    private Scanner in = new Scanner(System.in);

    public WriteCommand(Document doc) {
        super(doc);
        this.document=doc;
    }

    /**
     * writes the new line into the file for what the user wanted to add
     */
    public String execute() {
        System.out.println("What would you like to add?");
        String line = in.nextLine();
        return (document.write(line));
    }
}
