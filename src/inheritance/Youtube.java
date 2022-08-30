package src.inheritance;

public class Youtube extends App{
    public Youtube(double version){
        super("Sahara-media", version);
    }

    public void watchVideo(){
        System.out.println("Watching java tutorial");
    }

    @Override
    public String toString() {
        return "Youtube{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
