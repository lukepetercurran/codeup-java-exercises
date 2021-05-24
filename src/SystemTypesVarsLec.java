import java.sql.SQLOutput;

public class SystemTypesVarsLec {
    public static void main(String[] args){
        System.out.println("Hello Douglas");
        //Oh look, you can use brackets to section off your code. Thats neat.
        {
            System.out.println("Look at me!");
            System.out.println("I'm in brackets!");
        }
        /* TODO: Use multiline comments correctly.
        * I'm multiple lines long so I
        * can carry
        * a LOT of clairification
        *
        *
        * or just be annoying /shrug
         */
        System.out.println("But I'm not... :(");
        /*I also tkae up one line because I close myself afterward*/ System.out.println("I'm here too.");

        byte smallNumber = 34;
        System.out.println(smallNumber);

        short notAsSmallNumber = 30000;

        int num = 45000000;

        long postID = 14;

        System.out.println(postID);

        float decimal = 1.5F;

        double bigDecimal = 45;
        System.out.println(bigDecimal);

        final char SINGLE_LETTER = 'g';

        boolean amILearningJava = true;

        String message = "How's it going?\nEverything \"alright?\"\n\tJava isn't that scary, is it?";
        System.out.println(message);

        int sum = 4 + 5;
        System.out.println(sum);

        int difference = 72 - 19;
        System.out.println(difference);

        int product = 11 * 9;
        System.out.println(product);

        int quotient = product / sum;
        System.out.println(quotient);

        int remainder = difference % sum;
        System.out.println(remainder);

        int whatWillThisBe = -4 * 2;
        System.out.println(whatWillThisBe);

        System.out.println(sum++);
        System.out.println(sum);

        int iAmAnInt = 44;
        long iAmALong = iAmAnInt;
        System.out.println(iAmALong);

        iAmALong = Long.MAX_VALUE;
        System.out.println(++iAmALong);
        //
        iAmAnInt = (int) iAmALong;
        System.out.println(iAmAnInt);

        iAmAnInt = 27;
        double iAmADouble = iAmAnInt;
        System.out.println(iAmADouble);

        iAmADouble = 3.141598;
        iAmAnInt = (int) iAmADouble;
        System.out.println(iAmAnInt);
    }
}
