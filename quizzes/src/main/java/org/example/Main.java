package org.example;

public class Main {
    public static void main(String[] args) {
        Quiz newQuiz = new Quiz();
        TrueFalse question1 = new TrueFalse("Are kitties the absolute best in the land?", 1, "true");
        MultipleChoice question2 = new MultipleChoice("What is the number of living kitties currently considered part of the Heininger household?", 1, "1", "2", "3", "4", "3", false, false, true, false);
        Checkbox question3 = new Checkbox("Select all names of current living Heininger kitties.", 3, "Peepo", "Marcie", "Shmebulock", "Santiago", "abd", true, true, false, true);
//        System.out.println(question1);
//        System.out.println(question2);
//        System.out.println(question3);

        newQuiz.addQuestion(question1);
        newQuiz.addQuestion(question2);
        newQuiz.addQuestion(question3);

        newQuiz.runQuiz();
//String test1 = new String("poop");
//        System.out.println(test1.equals(((TrueFalse) question1).getCorrectAnswer()));

    }
}