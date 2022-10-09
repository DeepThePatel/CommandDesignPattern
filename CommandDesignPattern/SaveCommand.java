package CommandDesignPattern;

public class SaveCommand extends Command {
    public SaveCommand(Document doc) {
        super(doc);
        this.document = doc;
    }

    public String execute() {
        return document.save();
    }
}
