import java.util.ArrayList;

import CommandDesignPattern.FileManipulator;

public class Document {
    private String fileName;
    private ArrayList<String> lines = new ArrayList<String>();

    public Document(String fileName) {

    }

    /**
     * displays the file
     * @return each line of the file 
     */
    public String view() {
        return null;
    }

    /**
     * adds a line to the file
     * @param line
     * @return that the line has been appended to the file
     */
    public String append(String line) {
        lines.add(lines.size() - 2, "| " + line + " |");
        System.out.println("The line has been appended to the file.");
        return "The line has been appended to the file.";
    }

    /**
     * writes out the text file
     * @param line
     * @return that the line has been written to the file 
     */
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

    /**
     * uses file manipulator to write and save the file
     * @return if the file has been saved or not
     */
    public String save() {
        String ret = "";
        try {
            FileManipulator.writeFile(this.fileName, this.lines);
            ret = "The file has been saved";
        }
        catch(Exception e)
        {
            ret = "Sorry, we cannot save at this time";
        }
        System.out.println(ret);
        return ret;
    }
}
