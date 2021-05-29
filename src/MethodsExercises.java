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
        //2
        public static int getInteger(int min, int max) {
            int min =
            System.out.printf("Give me a number between %d and %d\n", min, max);
            Scanner scanner = new Scanner(System.in);
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

}


    public static void main(String[] args) {
        System.out.println(addition(3, 7));
        System.out.println(subtraction(14, 4));
        System.out.println(multiply(120, 6));
        System.out.println(division(50, 5));
//        System.out.println(division(5, 0)); // lol nope
        System.out.println(loopMultiply(3, 5));
        System.out.print("Enter a number between 1 and 10: ");
        System.out.println(getInteger);
    }


}
