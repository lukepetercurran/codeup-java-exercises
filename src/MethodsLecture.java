import java.util.Scanner;

public class MethodsLecture {

    public static void sayHello() {
        System.out.println("Sorry, I'm in a bit of a rush. Have a great day!");
    }
    public static void sayHello(String name) {
        System.out.printf("Hi there! My name is %s! Have a great day!%n", name);
    }

    public static void sayHello(String Salutation, String name) {
        System.out.printf("%s there! My name is %s! Have a great day!%n", Salutation, name);
    }

    public static void sayHello(int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("Hello Darling!");
        }
    }


    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static void willYouTakeUsToMtSplashmore(Scanner sc) {
        System.out.println("Will you take us to Mt. Splashmore?");
        if (!sc.nextLine().equalsIgnoreCase("yes")) {
            willYouTakeUsToMtSplashmore(sc);
        } else {
            System.out.println("Thanks Dad, you're the best!");
        }
    }

    public static void bottlesOfBlank(String beverage, int numBottles) {
        if(numBottles == 0) {
            System.out.printf("No more bottles of %s of the wall%nNo more bottles of %s%nStand up now, stumble around%nAll of the bottles of %s on the wall%n", beverage, beverage, beverage);
        } else if (numBottles == 1) {
            System.out.printf("One bottle of %s on the wall%nOne bottle of %s%nTake it down, pass it around%nNo more bottles of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        } else if (numBottles == 2) {
            System.out.printf("Two bottles of %s on the wall%nTwo bottles of %s%nTake one down, pass it around%nOne more bottle of %s on the wall%n", beverage, beverage, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        } else {
            System.out.printf("%d bottles of %s on the wall%n%d bottles of %s%nTake one down, pass it around%n%d more bottles of %s on the wall%n", numBottles, beverage, numBottles, beverage, numBottles -1, beverage);
            bottlesOfBlank(beverage, numBottles - 1);
        }
    }

        public static void main (String[]args){
            sayHello("Luke");
            System.out.println(multiply(5, 2));
            int product = multiply(7, 3);
            System.out.printf("Did you know that %d X %d ='s %d%n", product, product, product * product);
            willYouTakeUsToMtSplashmore(new Scanner(System.in));
            bottlesOfBlank("Water", 15);
        }
}
