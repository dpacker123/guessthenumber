import java.util.Random;
import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {
        var randomNumberPicker = new Random();
        var randomNumber = randomNumberPicker.nextInt(10) + 1;
        var inputReader = new Scanner(System.in);
        System.out.println("pick a random number from 1 to 10:");
        var userNumber = inputReader.nextInt();
        while (true) {
            if (randomNumber == userNumber) {
                System.out.println("You were right the was " + randomNumber);
                break;
            } else {
                System.out.println("Unfortuantely " + userNumber + " was not the right number.");
                if(userNumber > randomNumber)
                    System.out.println("Unfortunately " + userNumber + "was too high");
                else {
                    System.out.println("Unfortunatley " + userNumber + " was too low");
                    System.out.print("Try again!");
                    userNumber = inputReader.nextInt();
                }
            }

        }
    }
}
