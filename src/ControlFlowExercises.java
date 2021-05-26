public class ControlFlowExercises {
    public static void main(String[] args) {
//        // 1.A
//       int i = 5;
//       while (i <= 15) {
//           System.out.println(i);
//           i++;
//       }

//       // 1.B.A
//        int i = 0;
//        do {
//            System.out.println(i * 2);
//            i++;
//        } while (i < 51);

//        // 1.B.B WIP
//        int i = 100;
//        do {
//            System.out.println(i - 5);
//            i--;
//        } while (i > -10);

        // 1.B.C
        int i = 2;
        do {
            System.out.println(i*i);
            i *= i;
        } while (i < 100000);

        // 1.C.A

        // 1.C.B

        // 2

        /*You have to design the code such that the user has only three tries to guess the correct pin of the account. You set the pin as a constant with a final attribute. When correct display "Correct, welcome back." When incorrect display "Incorrect, try again.". When user runs out of tries display "Sorry but you have been locked out."
program Starts:
Please enter pin:
22132
Output:
Incorrect, try again.
Please enter pin:
23412
Output:
Incorrect, try again.
Please enter pin:
12345
Output:
Correct, welcome back.
 */







        // 4

        System.out.println("Would you like to find out your grade?");
        String answer = scanner.next().toLowerCase();
        if(answer.equals("yes")) {
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
