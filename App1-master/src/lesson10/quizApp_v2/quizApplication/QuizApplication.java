package lesson10.quizApp_v2.quizApplication;

import javax.swing.*;

import lesson10_v2.Expense;
import lesson10_v2.ExpensesService;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class QuizApplication extends JFrame {

    //variables
    private JLabel questionLabel;
    JRadioButton[] optionButtons;
    private JButton submitButton;
    private int score = 0;
    private int currentQuestionIndex = 0;
    Question[] questions;
    private Timer timer;
    private int timeLeftInSeconds = 10;

    //constructor
    public QuizApplication(Question[] questions) {
        this.questions = questions;

        setTitle("Quiz Application");
        setSize(450, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JPanel mainPanel = new JPanel(new BorderLayout());
        questionLabel = new JLabel(questions[currentQuestionIndex].getQuestion());
        mainPanel.add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel(new GridLayout(3, 1));
        optionButtons = new JRadioButton[3];
        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = new JRadioButton(questions[currentQuestionIndex].getOptions()[i]);
            buttonGroup.add(optionButtons[i]);
            // optionsPanel.add(buttonGroup[]);
            optionsPanel.add(optionButtons[i]);
        }
        mainPanel.add(optionsPanel, BorderLayout.CENTER);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new SubmitButtonListener());
        mainPanel.add(submitButton, BorderLayout.SOUTH);    //submit button positioned at the bottom


        setContentPane(mainPanel);  //to ensure all components displayed within the window

        //create and start the timer
        timer = new Timer(1000, new TimeListener());
        timer.start();
    }

    //Inner class for handling button click event
    private class SubmitButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Check if an option is selected
            int selectedOption = -1;
            for (int i = 0; i < optionButtons.length; i++) {
                if (optionButtons[i].isSelected()) {
                    selectedOption = i;
                    break;
                }
            }
            if (selectedOption == -1) {
                JOptionPane.showMessageDialog(QuizApplication.this, "Please select an option.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Check if the selected option is correct
            if (questions[currentQuestionIndex].getOptions()[selectedOption].equals(questions[currentQuestionIndex].getCorrectAnswer())) {
                score++;
            }

            // Stop the timer
            timer.stop();

            // Move to the next question or show the final score
            currentQuestionIndex++;
            if (currentQuestionIndex < questions.length) {
                questionLabel.setText(questions[currentQuestionIndex].getQuestion());
                String[] options = questions[currentQuestionIndex].getOptions();
                for (int i = 0; i < optionButtons.length; i++) {
                    optionButtons[i].setText(options[i]);
                    optionButtons[i].setSelected(false); // Clear selection
                }
                // Restart the timer for the next question
                timeLeftInSeconds = 10;
                // Reset timer
                timer.start();
            } else {
                JOptionPane.showMessageDialog(QuizApplication.this, "Quiz completed! Your score: " + score + "/" + questions.length, "Quiz Completed", JOptionPane.INFORMATION_MESSAGE);

                dispose(); // Close the application after quiz completion
                
                String date = "2024-02-24";
                QuizService quizService = new QuizService();
                Quiz quiz = new Quiz(0, score, Date.valueOf(date));
                quizService.insert(quiz);
            }
        }
    }

    private class TimeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(timeLeftInSeconds > 0){
                //Update the timer label
                submitButton.setText("Submit [Time left: " + timeLeftInSeconds + " s]");
                timeLeftInSeconds--;
            }else{
                //Automatically submit the answer when time runs out
                JOptionPane.showMessageDialog(QuizApplication.this, "Time's up! Submitting your answer.", "Time's Up", JOptionPane.WARNING_MESSAGE);
                timer.stop();

                currentQuestionIndex++;
                if (currentQuestionIndex < questions.length) {
                    questionLabel.setText(questions[currentQuestionIndex].getQuestion());
                    String[] options = questions[currentQuestionIndex].getOptions();
                    for (int i = 0; i < optionButtons.length; i++) {
                        optionButtons[i].setText(options[i]);
                        optionButtons[i].setSelected(false); // Clear selection
                    }
                    // Restart the timer for the next question
                    timeLeftInSeconds = 10;
                    // Reset timer
                    timer.start();
                } else {
                    JOptionPane.showMessageDialog(QuizApplication.this, "Quiz completed! Your score: " + score + "/" + questions.length, "Quiz Completed", JOptionPane.INFORMATION_MESSAGE);
                    dispose(); // Close the application after quiz completion
                }
            }
        }
        
    }

    // Method to read questions from a file and create Question objects
    public static List<Question> readQuestionsFromFile(String filename) throws IOException {
        List<Question> questions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String questionText = line;
                String[] options = new String[3];
                for (int i = 0; i < 3; i++) {
                    options[i] = br.readLine();
                }
                String correctAnswer = br.readLine();
                questions.add(new MultipleChoiceQuestion(questionText, options, correctAnswer));
                br.readLine();
            }
        }
        return questions;
    }

    public static void main(String[] args) {
        String filename = "questions.txt";
        try {
            List<Question> questions = readQuestionsFromFile(filename);
            SwingUtilities.invokeLater(() -> {
                // Create and display the GUI
                QuizApplication app = new QuizApplication(questions.toArray(new Question[0]));
                app.setVisible(true);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}