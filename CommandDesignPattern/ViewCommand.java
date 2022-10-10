public class ViewCommand extends Command {
    public ViewCommand(Document doc) {
        super(doc);
        this.document=doc;
    }
 

    /**
     * displays the file for the user
     */
    public String execute() {
        return document.view();
    }
}
