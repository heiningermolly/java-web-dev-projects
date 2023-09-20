package org.example;

public abstract class Question {
    private String questionText;
    private double pointsIfCorrect;



    private String questionType;

    public Question(String questionText, double pointsIfCorrect){
        this.questionText = questionText;
        this.pointsIfCorrect = pointsIfCorrect;
    }
//    private int number;

    public String getQuestion() {
        return questionText;
    }

    public void setQuestion(String question) {
        this.questionText = question;
    }

    public double getPointsIfCorrect() {
        return pointsIfCorrect;
    }

    public void setPointsIfCorrect(double pointsIfCorrect) {
        this.pointsIfCorrect = pointsIfCorrect;
    }

    public String getQuestionType() {
        return questionType;
    }
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

//    public int getNumber() {
//        return number;
//    }

//    public void setNumber(int number) {
//        this.number = number;
//    }

//    public abstract void isCorrect();
}
