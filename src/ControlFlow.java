import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
//        int x = 5;
//        if (x == 5) {
//            System.out.println("If you are reading this, it means x is 5");
//        }
//        System.out.println("On the other hand, this says nothing about x, because it runs regardless of what x is.");

//        int y = 2;
//        if ( y == 2) {
//            System.out.println("I've carried out a conditional test and I can confirm that the statement 'y == 2' is true");
//        } else {
//            System.out.println("I have tested to see if 'y==2' is true, and its not. It is false.");
//        }

//        short y = 30001;
//        if (y < 0){
//            System.out.println("The variable y contains a negative number value");
//        } else if (y >= 0 && y < 30000){
//            System.out.println("The variable y contains a positive number value");
//        } else {
//            System.out.println("The variable y contains a numeric value that is dangerously close to the max value for short type variables, which is " + Short.MAX_VALUE);
//        }

//        String customerChoice;
//        customerChoice = "caramel pistachio mocha";
//
//        switch (customerChoice) {
//            case "vanilla":
//                System.out.println("One Vanilla, coming right up!");
//                break;
//            case "chocolate":
//                System.out.println("Chocolate, coming right up!");
//                break;
//            case "strawberry":
//                System.out.println("Strawberry, coming right up!");
//                break;
//            default:
//                System.out.println("We don't have that! Go away!");
//                break;
//        }
//        int customerMaxBudget = 10;
//        //cannot do this. No boolean decisions in switch cases
//        switch(customerMaxBudget){
//            case (>=0 && <=1000){
//                System.out.println("Wouldn't you prefer a place for more limited budgets?");
//            }

////        String existence = "I exist";
//        boolean existence = true;
//        if (existence){
//            System.out.println("The programmer is a real being");
//        }

        /* Logistical Operators */

        // you can do && || &

//        int c = 0, d = 100, e = 50;
//        // short circuit operator
//        if (c == 1 && e++ < 100){ //wont run because c does not equal 1
//            // do anything
//        }
//        System.out.println("e = " + e);
//
//        if(c == 0 && e++ < 100) {
//            // do anything
//            d = 150;
//        }
//        System.out.println("e = " + e);
//
//        //non short circuit operator
//        if (c == 1 & e++ < 100){ //will run
//            // do anything
//        }
//        System.out.println("e = " + e);

//        boolean existence = true;
//        boolean solipsism = false;
//        boolean weAllLiveInSomoneElsesDream = false;
//        boolean thisDeskIsRealNotAProjectionOfMyMind = true;
//
//        if(solipsism | weAllLiveInSomoneElsesDream){
//            System.out.println("Common sense is victorious");
//        } else {
//            System.out.println("I'm really confused now");
//        }

//        if(solipsism || weAllLiveInSomoneElsesDream){
//            System.out.println("Common sense is victorious");
//        } else {
//            System.out.println("I'm really confused now");
//        }

        //comparison operator ==
        //there is no strict equality operator
        //inequality operator !=
        //there is no strict inequality, dont do this !==

//        String myName = "Luke";
//        String anotherLuke = "Luke";
//
//        String luke = new String("Luke");

//        System.out.println(myName == anotherLuke);
//        System.out.println(myName == luke);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String userInput = scanner.next();
//        if (userInput == myName){
//            System.out.println("Hello, me!");
//        } else {
//            System.out.println("You are not me");
//        }

//        if (userInput.equals(myName)){
//            System.out.println("Hello, me!");
//        } else {
//            System.out.println("You are not me");
//        }

        /* Loops */

//        int i = 1;
//        while (i < 10) {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//             i++;
//            System.out.println("I'm still in the loop, but i has incremented now, and its value is " + i);
//        }
//        System.out.println("This is outside the loop, after it has executed. The conditional has tested false. The value of i is now " + i);

        /* Do While Loops */


        // int i = 15427;
//        do {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//            i++;
//            System.out.println("I'm still in the loop, but i has incremented now, and its value is " + i);
//        } while ( i < 10 );
//        System.out.println("This is outside the loop, after it has executed. The conditional has tested false. The value of i is now " + i);


//        for (int = 0; i < 10; i++) {
//            System.out.println("Now I'm in the loop. i has not incremented yet and its value is " + i);
//        }
//
//        // I can't access the variable i outside the loop code block
//        System.out.println("This is outside the loop, after it has executed. The conditional has tested false. The value of i is now " + i);

        // In a for loop, the increment is always the last thing that happens in the code block. It's automatic behavior. If i want to do anything after the increment, I must use a while-style loop.

        // group code 99 cans of big red

        for (int i = 100; i > 0; i--) {

            if (i == 1) {

                System.out.println(i + " can of Big Red on the Wall,");
                System.out.println(i + " can of Big Red,");
                System.out.println("Take one down, pass it around, ");
            } else if (i == 0) {
                System.out.println("No more cans of Big Red on the wall");
                System.out.println("No more cans of Big Red");
                System.out.println("You go to the store, and buy some more,");
                System.out.println("99 cans of Big Red on the wall");
            } else {
                System.out.println(i + " cans of Big Red on the Wall,");
                System.out.println(i + " cans of Big Red on the Wall");
                System.out.println(i + " cans of Big Red,");
                System.out.println("Take one down, pass it around, ");
            }


        }
    }
}
