import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
       /* Bob is a lackadaisical teenager. In conversation, his responses are very limited.

        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
        He answers 'Whatever.' to anything else.
        Write the Java code necessary so that a user of your command line application can have a conversation with Bob. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Hey my names Bob... My mom said you wanted to talk to me, or something... Whatever...");
        String response = "";
        while(!response.equalsIgnoreCase("Quit")) {
            System.out.println("What do you want?");
            response = sc.nextLine();
            if (response.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (response.endsWith("Bob, who are you, really?")) {
                System.out.println("Bob Vance, Vance Refrigeration");
            } else if (response.endsWith("?")) {
                System.out.println("Sure");
            } else if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever.");
            }
        }
        System.out.println("I'm out of here...");
        System.out.println("Yeah, whatever Bob");
    }
}
