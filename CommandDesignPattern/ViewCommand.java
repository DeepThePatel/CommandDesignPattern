public class ViewCommand extends Command {
    public ViewCommand(Document doc) {
        super(doc);
        this.document=doc;
    }
 

    public String execute() {
        return document.view();
    }
}
