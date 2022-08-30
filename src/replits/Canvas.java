package src.replits;

import java.util.ArrayList;

public class Canvas {
    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas(String topic) {
        this.topic = topic;
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this.topic = topic;
        this.quizzes = quizzes;
        this.modules = modules;
    }

    @Override
    public String toString() {
        return  topic  +
                "\nQuizzes: \n" + quizzes +
                "\nModules:\n" + modules ;
    }
}
