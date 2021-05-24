public class HelloWorld {
    public static void main(String[] args){ //bruh wut,

        System.out.print("Hello");      //Java requires "", '' will not work.
        System.out.println (", World!");  // Sout, tab hotkey command

        // 1
        int myFavoriteNumber = 32;
        System.out.println(myFavoriteNumber);

        // 2
        String myString = "spaghettiString";
        System.out.println(myString);

        // 3
//        myString = 'spaghettiString'; Code breaks. '' represents a character, not a string.

        // 4
//        myString = 3.14159; Code breaks. the variable myString is set to a String object. You cannot assign a number to a String object.

        // 5
//        long myNumber; empty variable.
//        System.out.println(myNumber);

        // 6
//        long myNumber = 3.14; cannot put decimal values in a long variable.
//        System.out.println(myNumber);

        // 7
        long myNumber = 123L;
        System.out.println(myNumber);

        // 8
//        long myNumber = 123; // a long value will only compile if given an integer value. Any decimals will break the code
//        System.out.println(myNumber);

        // 9
//        float myNumber = 3.14; // This code is broken and can be fixed using one of two methods.
//                           3.14F;              // Placing an F the value to signify it is a float value will work,
//                           (float) 3.14;

        // 10
//         int x = 5;
//        System.out.println(x++); //prints x, then increments x
//        System.out.println(x); // output is 5,6
//        int x = 5;
//        System.out.println(++x); //increments x, then prints x
//        System.out.println(x); //output is 6,6

        // 11
//        var class; // Class is a constant and cannot be used as a variable name.

          // 12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; // the object o is a string. You cannot pass a string as an integer.
//        int three = (int) "three"; // the object "three" is also a string. You cannot pass a string as an integer.

          // 13.A
        int x = 4;
        x += 5;
//      x = x + 5;
        System.out.println(x);

          // 13.B
//        int x = 3;
//        int y = 4;
////      y = y * x;
//        y *= x;
//        System.out.println(x);

          // 13.C
//        int x = 10;
//        int y = 2;
////        x = x / y;
////        y = y - x;
//        x /= y;
//        y -= x;
//        System.out.println(x);
//        System.out.println(y);

        // 14
        /* You cannot assign a numerical variable that is larger than its type can hold.
        * Integer.MAX_VALUE is equal to 2147483647. Any value below that can fit. Any value above it will break your code.
         */
//        System.out.println(Integer.MAX_VALUE);
//        int failure = 2147483648;
    }
}
