import java.util.Scanner;

public class Questions {

    String playerAnswer;
    boolean isCorrect = true, isInvalid = false;
    int life = 5;
    int points = 0;
    
    Scanner scan = new Scanner(System.in);

    Questions(String playerAnswer, boolean isCorrect, boolean isInvalid, int life, int points) {
        this.playerAnswer = playerAnswer;
        this. isCorrect = isCorrect;
        this.isInvalid = isInvalid;
        this.life = life;
        this.points = points;
    }

    void welcome() {
        System.out.println("=-----------------------------------=");
        System.out.println("Welcom to The Quiz Game!");
        System.out.println();
        System.out.println("Game Mechanic: Answer True or False.");
        System.out.println("There are a total of 5 questions and you have 5 lives.");
        System.out.println("Everytime you make a mistake, 1 point from your lives will be deducted. Good luck!");
        System.out.println();
        System.out.println("=--------[Enter To Start]-----------=");
        System.out.println();
        scan.nextLine();
    }

    void questionsOne(){
        System.out.println("[True or False]");
        System.out.println("=---------------------------=");
        System.out.println("Question#1: ");
        System.out.println("% is an Arithmethic Operator");

        System.out.print("Your Answer: ");
        playerAnswer = scan.nextLine();
        System.out.println("=---------------------------=");
    }

    void questionTwo() {
        System.out.println("=---------------------------=");
        System.out.println("Question#2:");
        System.out.println("== is an Assignment Operator");

        System.out.print("Your Answer: ");
        playerAnswer = scan.nextLine();
        System.out.println("=---------------------------=");
    }

    void questionThree() {
        System.out.println("=---------------------------=");
        System.out.println("Question#3:");
        System.out.println("%= is an Assignment Operator");

        System.out.print("Your Answer: ");
        playerAnswer = scan.nextLine();
        System.out.println("=---------------------------=");
    }

    void questionFour() {
        System.out.println("=---------------------------=");
        System.out.println("Question#4: ");
        System.out.println(" + is an Arithmethic Operation");

        System.out.print("Your Answer: ");
        playerAnswer = scan.nextLine();
        System.out.println("=---------------------------=");
    }

    void questionFive() {
        System.out.println("=---------------------------=");
        System.out.println("Last Question#5:");
        System.out.println(">= is a Comparison Operator");

        System.out.print("Your Answer: ");
        playerAnswer = scan.nextLine();
       System.out.println("=---------------------------=");
    }

    void congratulations() {
        System.out.println("");
        System.out.println("=---------------------------=");
        System.out.println("Congratulations! You Won!");
        System.out.println("number of lives left: " + life);
        System.out.println("Your Total Points: " + points + "/10");
        System.out.println("=---------------------------=");
        System.out.println("");
    }
}