import java.util.Locale;
import java.util.Scanner;

public class MultipleChoiceQuestion {
    public static void main(String[] args) {
        String question = "What is the highest mountain in the world?";
        String choiceOne = "k2";
        String choiceTwo = "everest";
        String choiceThree = "fuji";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + " or " + choiceThree + ".");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer! The correct answer is " + correctAnswer);
        }
    }
}
