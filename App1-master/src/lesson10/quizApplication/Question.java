package lesson10.quizApplication;

// Abstract class providing common functionality for questions
abstract class Question implements QuestionType {
    private String question;
    private String[] options;
    private String correctAnswer;

    public Question(String question, String[] options, String correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String[] getOptions() {
        return options;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    //Abstract method to display the question type
    public abstract String getType();
}

