package CommandDesignPattern;

public class SaveCommand extends Command{
    public SaveCommand(Document doc) {
        super(doc);
        doc.save();
    }

    public String execute() {
        return "The file has been saved";
    }
}
