import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args)
    {
        int answer, guess;

        final int MAX = 100;


        Scanner sc = new Scanner(System.in);


        Random rand = new Random();

        boolean correct = false;


        answer = rand.nextInt(MAX) + 1;


        while (!correct) {

            System.out.println(
                    "Guess a number between 1 and 100: ");


            guess = sc.nextInt();


            if (guess > answer) {
                System.out.println("Too high, try again");
            }


            else if (guess < answer) {
                System.out.println("Too low, try again");
            }


            else {
                try {
                    FileWriter myWriter = new FileWriter("Output.txt");
                    String str="Yes! you guessed the number,Guessed random number is:" + answer;
                    myWriter.write(str);
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                correct = true;
            }
        }
        System.exit(0);
    }
}
