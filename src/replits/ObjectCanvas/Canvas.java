package src.replits.ObjectCanvas;

import src.replits.Quiz;

import java.util.ArrayList;

public class Canvas {
    String topic;
    ArrayList<Quiz> quizzes;
    ArrayList<Module> modules;

    public Canvas(String topic) {
        this.topic = topic;
        this.modules=new ArrayList<>();
        this.quizzes= new ArrayList<>();
    }

    public Canvas(String topic, ArrayList<Quiz> quizzes, ArrayList<Module> modules) {
        this.topic = topic;
        this.quizzes = quizzes;
        this.modules = modules;
    }

    @Override
    public String toString() {
        return  topic  +
                " course\nQuizzes:\n" + quizzes +
                "\nModules:\n" + modules ;
    }

}
