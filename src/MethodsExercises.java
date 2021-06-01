import java.util.Scanner;

public class MethodsExercises {
    // 1

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int loopMultiply(int x, int y) { //bonus
        int result = 0;
        while (x > 0) {
            result += y;
            x--;
        }
        return result;
    }

    public static int multiplyRecursion(int x, int y) {
        if (x == 0 || y == 0) {
            return 0;
        } else if (x == 1) {
            return y;
        } else {
            return x + (multiplyRecursion(x, y - 1));
        }
    }

    public static int divide(int num1, int num2) {
        if (num1 == 0 && num2 == 0) {
            return 0;

        } else {
            return num1 / num2;
        }
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    //2

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Give me a number between %d and %d\n", min, max);
        int userNumber = scanner.nextInt();
        if ((userNumber > max) || (userNumber < min)) {
            System.out.println("Try again!");
            return getInteger(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNumber);
            return userNumber;
        }
    }

    // 3

    public static long getFactorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number between %d and %d%n", 1, 10);
        int input = scanner.nextInt();
        String newString = input + "! = ";
        long result = input;
        for (int i = 1; i < input; i++) {
            if (input > 1 || input < 10) {
                newString += i + " x ";
                result *= i;
            } else {
                System.out.println("Oops, try again");
                return getFactorial();
            }
        }
        newString += input + " = " + result;
        System.out.printf(newString + "\n");
        scanner.nextLine();
        System.out.println("Do you want to do it again? yes / no");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            getFactorial();
        }
        return result;
    }

     // 4

//    public static int rollDice() {
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter the number of sides you want on your pair of dice");
////        int sides = scanner.nextInt();
////        System.out.println("Enter \"Roll\" to roll dice");
////    }



    public static void main(String[] args) {
    System.out.println(addition(3, 7));
    System.out.println(subtraction(14, 4));
    System.out.println(multiply(120, 6));
    System.out.println(division(50, 5));
//        System.out.println(division(5, 0)); // lol nope
    System.out.println(loopMultiply(3, 5));
    System.out.print("Enter a number between 1 and 10: ");
    System.out.println(getInteger(1, 10));
    getFactorial();
}
}
