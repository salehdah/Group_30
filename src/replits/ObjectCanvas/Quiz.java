package src.replits.ObjectCanvas;

public class Quiz {
    String topic;
    int totalNumberOfQuestion;
    double totalPoints;

    public Quiz(String topic, int totalNumberOfQuestion, double totalPoints) {
        this.topic = topic;
        this.totalNumberOfQuestion = totalNumberOfQuestion;
        this.totalPoints = totalPoints;
    }
    public void takeQuiz(){
        System.out.println("Taking the "+ topic+ " quiz");
    }

    @Override
    public String toString() {
        return "Quiz | " +
                topic + " quiz with "  + totalNumberOfQuestion +" questions for a total of "+
                totalPoints +" total points"
                ;
    }


}
