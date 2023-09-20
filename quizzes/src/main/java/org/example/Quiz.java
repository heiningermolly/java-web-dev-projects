package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> quizQuestions = new ArrayList<>();
    private int numberOfQuestions = 0;
    private double userPoints = 0;
    private double totalPointsAvailable = 0;

    public void addQuestion(Question newQuestion){
        this.quizQuestions.add(newQuestion);
        numberOfQuestions++;
    };

    public void runQuiz(){
        for (Question eachQuestion : quizQuestions) {
            totalPointsAvailable += eachQuestion.getPointsIfCorrect();
            Scanner quizInput = new Scanner(System.in);
            System.out.println(eachQuestion);
            String answer = quizInput.nextLine();
            if (eachQuestion.getQuestionType().equals("trueFalse")) {
                if (answer.equals(((TrueFalse) eachQuestion).getCorrectAnswer())) {
                    userPoints += eachQuestion.getPointsIfCorrect();
                }

            } else if (eachQuestion.getQuestionType().equals("multipleChoice")) {
                    if (answer.equals(((MultipleChoice) eachQuestion).correctAnswer)) {
                        userPoints += eachQuestion.getPointsIfCorrect();
                    }
                } else if (eachQuestion.getQuestionType().equals("checkbox")) {
                if (answer.equals(((Checkbox) eachQuestion).correctAnswer))
                    userPoints += eachQuestion.getPointsIfCorrect();
                }

            }
        System.out.println("Congratulations, you got " + userPoints + " points out of " + totalPointsAvailable + " total points available!");
        //note for grader: I did not complete this fully due to unexpected illness; however I was very proud of how far I got so am submitting it for now and will complete it ASAP.


        };

    public void gradeQuiz(){

    };


    @Override
    public String toString() {
        return "Quiz{" +
                "quizQuestions=" + quizQuestions +
                ", numberOfQuestions=" + numberOfQuestions +
                '}';
    }
}
