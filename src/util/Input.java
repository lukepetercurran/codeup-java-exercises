package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    //                      = new Scanner(System.in);

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Gimme a string");
        String userString = scanner.nextLine();
        System.out.println("Your string is : " + userString);
        return userString;
        // or
        // return this.scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or no?");
        String userYesNo = this.scanner.nextLine();
        boolean result = false;
        if (userYesNo.equalsIgnoreCase("yes")){
            result = true;
        } else if (userYesNo.equalsIgnoreCase("no")){
            result = false;
        }
        System.out.println("Your boolean is " + result);
        return result;

        // or
        // String userYesNo = this.scanner.nextLine();
        //return userYesNo.trim().equalsIgnoreCase("y") || userYesNo.trim().equalsIgnoreCase("yes")
    }

    public int getInt(){
//        System.out.println(prompt);
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max){
        System.out.printf("Gimme a number between %d and %d.%n", min, max);
        int userNum = scanner.nextInt();
        scanner.nextLine();
        if ((userNum >= max) && (userNum <= min)) {
            return getInt(min, max);
        } else {
            System.out.printf("Try again!");
            return userNum;
        }
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Give me a decimal number between %f and %f", min, max);
        double userNum = this.scanner.nextDouble();

        if(userNum >= min && userNum <= max) {
            return userNum;
        } else {
            System.out.println("That number is invalid");
            return getDouble(min, max);
        }
    }
}
