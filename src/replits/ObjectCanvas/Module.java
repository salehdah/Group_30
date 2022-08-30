package src.replits.ObjectCanvas;

import java.util.ArrayList;

public class Module {
    String name;
    ArrayList<File> files;

    public Module(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public Module(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.removeIf(f -> f.name.equals(file.name) && f.size==file.size);
    }



    @Override
    public String toString() {
        return name + "\nFiles:\n" + files;
    }

}
