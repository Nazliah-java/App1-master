package lesson10.quizApp_v2.quizApplication;

//INTERFACES
//Interface representing the type of question
public interface QuestionType {
    
    String getType();
    String getQuestion();
    String[] getOptions();
    String getCorrectAnswer();

}
