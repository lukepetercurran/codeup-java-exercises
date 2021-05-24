import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // 1.
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        // Scanner 1.
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Give me a number.");
//        int num = scanner.nextInt();
//
//        System.out.printf("num is = to %d%n", num);

        // Scanner 2.
        System.out.println("Give me 3 words.");
        String firstWord =  scanner.nextLine();
        System.out.println(firstWord);
        String secondWord = scanner.nextLine();
        System.out.println(secondWord);
        String thirdWord = scanner.nextLine();
        System.out.println(thirdWord);


        // Scanner 3 & 4
        System.out.println("Enter a sentence.");
        String inputSentence = scanner.nextLine();
        System.out.println(inputSentence);

//        // Codeup Perimeter 1
//        System.out.println("What is the width, in feet, of this classroom?");
//        String width = scanner.next();
//        System.out.println("What is the length, in feet, of this classroom?");
//        String length = scanner.next();
//        System.out.println("The perimeter of this classroom, in feet is "
//
//        System.out.println("The perimeter of this classroom, in feet, is " ((length * 2) + (width *2)));
    }
}
