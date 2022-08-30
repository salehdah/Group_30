package src.replits;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class Module {
    String name;
    ArrayList<File> files =new ArrayList<>();

    public Module(String name) {
        this.name = name;
    }

    public Module(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }
    public void addFile(File file){
        files.add(file);
    }
    public void removeFile(File file){
     //  files.removeIf(each -> each.name.equals(file.name) && each.size==file.size);
        Iterator<File> it = files.iterator();
        while(it.hasNext()){
            File filex = it.next();
            if(filex.name.equals(file.name)&&filex.size==file.size){
                it.remove();
            }
        }

    }

    @Override
    public String toString() {
        return  name  + "\nFiles: \n" + files;
    }
}
