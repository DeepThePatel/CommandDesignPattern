import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(Document document) {

    }

    /**
     * stores the data that is entered into the hashmap
     * @param data
     */
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
