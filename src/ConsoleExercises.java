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
//        System.out.printf("num is = to %d%n", num);

        // Scanner 2.
//        System.out.println("Give me 3 words."); //First Try
//        String firstWord =  scanner.nextLine();
//        System.out.println(firstWord);
//        String secondWord = scanner.nextLine();
//        System.out.println(secondWord);
//        String thirdWord = scanner.nextLine();
//        System.out.println(thirdWord);
//
//
//        System.out.println("Give me a word");
//        String str1 = scanner.next();
//        System.out.println("Another One");
//        String str2 = scanner.next();
//        System.out.println("One More");
//        String str3 = scanner.next();
//        System.out.printf("You entered the strings \"%s\", \"%s\", and  \"%s\".%n", str1, str2, str3);


        // Scanner 3 & 4
//        System.out.println("Enter a sentence.");
//        String inputSentence = scanner.nextLine();
//        System.out.println(inputSentence);
//        System.out.printf("You entered: \"%s\"%n", inputSentence);

//        // Codeup Perimeter 1
//        System.out.println("What is the width, in feet, of this classroom?");
//        String width = scanner.next();
//        System.out.println("What is the length, in feet, of this classroom?");
//        String length = scanner.next();
//        System.out.println("The perimeter of this classroom, in feet is "
//
//        System.out.println("The perimeter of this classroom, in feet, is " ((length * 2) + (width *2)));

        // Area and Perimeter Calculator
        System.out.println("Give me a length in meters:");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length entered: %d meters. %nGive me a width in meters:%n", length);
        int width = Integer.parseInt(scanner.nextLine());
        System.out.printf("Length entered: %d meters. %nWidth entered: %d meters. %n Area of room would be %d meters squared.%nPerimeter of room: %d meters.%n", length, width,length * width, 2 * width + 2 * length);
    }
}
