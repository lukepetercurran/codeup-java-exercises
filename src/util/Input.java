package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        System.out.println("Gimme a string");
        String userString = scanner.nextLine();
        System.out.println("Your string is : " + userString);
        return userString;
    }

    public boolean yesNo(){
        System.out.println("Yes or no?");
        String userYesNo = scanner.nextLine();
        boolean result = false;
        if (userYesNo.equalsIgnoreCase("yes")){
            result = true;
        } else if (userYesNo.equalsIgnoreCase("no")){
            result = false;
        }
        System.out.println("Your boolean is " + result);
        return result;
    }

    public int getInt(int min, int max){
        System.out.printf("Gimme a number between %d and %d.%n", min, max);
        int userNum = scanner.nextInt();
        scanner.nextLine();
        if ((userNum > max) || (userNum < min)) {
            System.out.println("Try again!");
            return getInt(min, max);
        } else {
            System.out.printf("Thank you for following directions! Your number was %d!%n", userNum);
            return userNum;
        }
    }



}
