package lesson10.quizApplication;

//Interface representing the type of question
public interface QuestionType {
    
    String getType();
    String getQuestion();
    String[] getOptions();
    String getCorrectAnswer();

}
