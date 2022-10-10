public class SaveCommand extends Command {
    public SaveCommand(Document doc) {
        super(doc);
        this.document=doc;


    }

    /**
     * tells the user the file has been saved
     */
    public String execute() {
        return document.save();
    }
}
