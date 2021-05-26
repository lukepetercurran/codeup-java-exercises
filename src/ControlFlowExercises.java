import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
//        // 1.A
//       int i = 5;
//       while (i <= 15) {
//           System.out.println(i++);
//       }

//       // 1.B.A
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        // 1.B.B
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//          // 1.B.C
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);

        // 1.C.A
//        for (int i = 100; i >= -10; i -=5){
//            System.out.println(i);
//        }

//        // 1.C.B
//        for (long i = 2L; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

//        // 2
//        Scanner scanner1 = new Scanner(System.in);
//        final int PIN = 12345;
//        int userInput = 0;
//        int attempts = 1;
//        while (attempts <= 3) {
//            System.out.println("Please enter pin: ");
//            userInput = scanner1.nextInt();
//            if (userInput != PIN) {
//                if (attempts < 3) {
//                    System.out.println("Incorrect, try again");
//                } else {
//                    System.out.println("Sorry, but you have been locked out");
//                }
//            } else {
//                System.out.println("Correct, welcome back!");
//                break;
//            }
//            attempts++;
//        }

        // 3

        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int userInput = scanner.nextInt();
        System.out.println("Here is your table");
        System.out.println("");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= userInput; i++) {
            System.out.printf("%-7d | %-8d | %-5d%n", i, i * i, i * i * i);
        }

        // 4

        System.out.println("Would you like to find out your grade?");
        String answer = scanner.next().toLowerCase();
        if (answer.equals("yes")) {
            System.out.println("Enter your grade 0-100");
            int grade = scanner.nextInt();
            if ((grade >= 88) && (grade <= 100)) {
                System.out.println("Your grade is an A!");
            } else if ((grade >= 80) && (grade <= 87)) {
                System.out.println("Your grade is a B!");
            } else if ((grade >= 67) && (grade <= 79)) {
                System.out.println("Your grade is a C!");
            } else if (grade <= 59) {
                System.out.println("Your grade is a F!");
            }
        }
    }
}
