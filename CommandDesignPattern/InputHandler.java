package CommandDesignPattern;


import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands = new HashMap();

    public InputHandler(Document document) {
        SaveCommand saveCommand = new SaveCommand(document);
        commands.put("save", saveCommand);
        AppendCommand appendCommand = new AppendCommand(document);
        commands.put("append", appendCommand);
        ViewCommand viewCommand = new ViewCommand(document);
        commands.put("view", viewCommand);
        WriteCommand writeCommand = new WriteCommand(document);
        commands.put("write", writeCommand);
    }

    public void inputEntered(String data) {
        if (commands.containsKey(data))
        {
            Command command = commands.get(data);
            command.execute();
        }
        else
        {
            System.out.println("Sorry, we couldn't recognize that command.");
        }
    }
}
