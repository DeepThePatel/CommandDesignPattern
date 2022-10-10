package CommandDesignPattern;

import java.util.ArrayList;

public class Document {
    private String fileName;
    private ArrayList<String> lines = new ArrayList<String>();

    public Document(String fileName) {

    }

    public String view() {
        return null;
    }

    public String append(String line) {
        lines.add(lines.size() - 2, "| " + line + " |");
        System.out.println("The line has been appended to the file.");
        return "The line has been appended to the file.";
    }

    public String write(String line) {
        lines.clear();
        lines.add("________________");
        lines.add(" ");
        lines.add(" ");
        lines.add("________________");
        lines.add(lines.size() - 2, "| " + line + " |");
        System.out.println("The line has been written to the file");
        return "The line has been written to the file";
    }

    public String save() {
        return null;
    }
}
