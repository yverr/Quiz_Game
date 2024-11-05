import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        // The do-while loop is unecessary, but it was required by the challenge, feel free to ignore the do-while loop. 
        // It's only purpose is to repeat the question when the answer is wrong(very unecessay, but it's the challenge).

        Scanner scan = new Scanner(System.in);

        Questions q = new Questions( "",true, false, 5, 0);

        do {

            q.questionsOne();

            if (q.playerAnswer.equalsIgnoreCase("True")){

                System.out.println("");
                System.out.println("Your Answer Is Correct!");
                q.isCorrect = true;
                q.points = q.points + 2;
            
                
            } else if (q.life==1){

                System.out.println("You Lose!");
                break;

            } else{

                System.out.println();
                System.out.println("Wrong! Try Again. (-1 life)");
                q.isCorrect = false;
                q.life--;
                q.points--;

                System.out.println("number of lives left: " + q.life);
                System.out.println();
            }

        }while(!q.isCorrect);


        System.out.println("Next question.");
        System.out.println();

        do {
            
            q.questionTwo();

            if (q.playerAnswer.equalsIgnoreCase("False")){

                System.out.println();
                System.out.println("Your Answer Is Correct!");
                q.isCorrect = true;
                q.points = q.points + 2;
                
            } else if (q.life==1){

                System.out.println("You Lose!");
                System.out.println("lives left: " + q.life);
                break;

            } else{

                System.out.println();
                System.out.println("Wrong! Try Again. (-1 life)");
                q.isCorrect = false;
                q.life--;
                q.points--;

                System.out.println("number of lives left: " + q.life);
                System.out.println();
            }


        }while(!q.isCorrect);

        System.out.println("Next question.");
        System.out.println();

        do {
            
            q.questionThree();

            if (q.playerAnswer.equalsIgnoreCase("True")){

                System.out.println();
                System.out.println("Your Answer Is Correct!");
                q.isCorrect = true;
                q.points = q.points + 2;
                
            } else if (q.life==1){

                System.out.println("You Lose!");
                System.out.println("lives left: " + q.life);
                break;

            } else{

                System.out.println();
                System.out.println("Wrong! Try Again. (-1 life)");
                q.isCorrect = false;
                q.life--;
                q.points--;

                System.out.println("number of lives left: " + q.life);
                System.out.println();
            }

        }while(!q.isCorrect);

        System.out.println("Next question.");
        System.out.println();

        do {
 
            q.questionFour();

            if (q.playerAnswer.equalsIgnoreCase("True")){

                System.out.println();
                System.out.println("Your Answer Is Correct!");
                q.isCorrect = true;
                q.points = q.points + 2;
                
            } else if (q.life==1){

                System.out.println("You Lose!");
                System.out.println("lives left: " + q.life);
                break;

            } else{

                System.out.println();
                System.out.println("Wrong! Try Again. (-1 life)");
                q.isCorrect = false;
                q.life--;
                q.points--;

                System.out.println("number of lives left: " +  q.life);
                System.out.println();
            }

        }while(!q.isCorrect);

        System.out.println("Next question.");
        System.out.println();

        do {

            q.questionFive();

            if (q.playerAnswer.equalsIgnoreCase("True")){

                System.out.println();
                System.out.println("Your Answer Is Correct!");
                q.isCorrect = true;
                q.points = q.points + 2;
                
            } else if (q.life==1){

                System.out.println("You Lose!");
                System.out.println("lives left: " + q.life);
                break;

            } else{

                System.out.println();
                System.out.println("Wrong! Try Again. (-1 life)");
                q.isCorrect = false;
                q.life--;
                q.points--;

                System.out.println("number of lives left: " + q.life);
                System.out.println();
            }

        }while(!q.isCorrect);

        q.congratulations();
      
        scan.close();       
   
    }
    
    
}