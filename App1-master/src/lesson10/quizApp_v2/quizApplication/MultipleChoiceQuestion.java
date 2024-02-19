package lesson10.quizApp_v2.quizApplication;

class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, String[] options, String correctAnswer) {

        super(question, options, correctAnswer);
    }

        @Override
        public String getType(){
            return "Multiple Choice";
        }
    }


