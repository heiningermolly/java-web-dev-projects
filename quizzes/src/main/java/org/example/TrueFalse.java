package org.example;

public class TrueFalse extends Question {
    private String correctAnswer;

    public TrueFalse(String questionText, double pointsIfCorrect, String correctAnswer) {
        super(questionText, pointsIfCorrect);
        setQuestionType("trueFalse");
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


    @Override
    public String toString() {
        return "Q: " + getQuestion() + "\ntrue or false\n";
    }
}
