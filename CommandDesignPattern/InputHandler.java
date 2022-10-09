package CommandDesignPattern;

import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String,Command>();

    public InputHandler(Document document) {
        commands.put("save",SaveCommand);
        commands.put("view",ViewCommand);
        commands.put("append",AppendCommand);
        commands.put("write",WriteCommand);
    }

    public void inputEntered(String data) {

    }
}
