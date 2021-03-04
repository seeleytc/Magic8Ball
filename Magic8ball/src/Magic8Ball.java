java.util.Scanner;
java.util.Random;
public class Magic8Ball {
    public static void main(String[] args) {
        String[] outcomes =
                {"It is certain", "It is decidedly so.", "Without a doubt.", "Yes – definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful"};
        Scanner scan = new Scanner(System.in);
        while (true) {
            Random randNum = new Random();
            int num = randNum.nextInt(20);
            System.out.println("Any other questions? yes or no");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                break;
            }


        }
    }
}