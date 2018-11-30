import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");
        boolean hasWon = false;

        Scanner sc = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + "guess(es) left. Choose again");
            int guess = sc.nextInt();
            System.out.println("Your guess was : " + guess);

            if(randomNumber > guess){
                System.out.println("It`s greater than " + guess + ".");
            }
            if(randomNumber < guess){
                System.out.println("It`s smaller than " + guess + ".");
            }
            if(randomNumber == guess){
                hasWon = true;
                break;
            }
        }
    if(hasWon){
        System.out.println("CORRECT... YOU WIN!!!");
    }else {
        System.out.println("GAME OVER... YOU LOOSE!!!\nThe number was: " + randomNumber);
    }
    }
}
