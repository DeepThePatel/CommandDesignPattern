package CommandDesignPattern;

public class SaveCommand {
    public SaveCommand(Document doc) {

    }

    public String execute() {
        return "The file has been saved";
    }
}
