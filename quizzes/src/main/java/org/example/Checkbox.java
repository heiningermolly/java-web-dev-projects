package org.example;

public class Checkbox extends Question {

    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;

    public String correctAnswer;

    private boolean isA1Right;
    private boolean isA2Right;
    private boolean isA3Right;
    private boolean isA4Right;

    public Checkbox(String questionText, double pointsIfCorrect, String answer1, String answer2, String answer3, String answer4, String correctAnswer, boolean isA1Right, boolean isA2Right, boolean isA3Right, boolean isA4Right) {
        super(questionText, pointsIfCorrect);
        setQuestionType("checkbox");
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
        this.isA1Right = isA1Right;
        this.isA2Right = isA2Right;
        this.isA3Right = isA3Right;
        this.isA4Right = isA4Right;
    }

    @Override
    public String toString() {
        return getQuestion() +
                "\na) " + answer1 +
                "\nb) " + answer2 +
                "\nc) " + answer3 +
                "\nd) " + answer4 + "\n";
    }
}
