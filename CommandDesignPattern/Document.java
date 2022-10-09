package CommandDesignPattern;


import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public class Document {
    private String fileName;
    private ArrayList<String> lines = new ArrayList<String>();

    public Document(String fileName) {
        this.fileName=fileName;
        this.lines=FileManipulator.readFile(fileName);
        lines.add("________________");
        lines.add("            ");
        lines.add("               ");
        lines.add("________________");
    }

    public String view() {
        for (int i=0;i<lines.size();i++)
        {
            System.out.println(lines.get(i));
        }
        
        return "";
    }

    public String append(String line) {
        lines.add(lines.size()-2,"|     "+line+  "     |");
        System.out.println("The line has been appended to the file.");
        return "The line has been appended to the file.";
    }

    public String write(String line) {
        lines.clear();
        lines.add("________________");
        lines.add("            ");
        lines.add("               ");
        lines.add("________________");
        lines.add(lines.size()-2,"|     "+line+  "     |");
        System.out.println("The line has been written to the file");
        return "The line has been written to the file";
    }

    public String save() {
        String ret ="";
        try
        {
        FileManipulator.writeFile(this.fileName,this.lines);
        ret = "The file has been saved";
        }
        catch( Exception e)
        {
            ret = "Sorry, we cannot save at this time.";
        }
        System.out.println(ret);
        return ret;
        
        
    }
}
