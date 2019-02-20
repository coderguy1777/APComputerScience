package ButtonInterface;
import java.util.Scanner;

public class ButtonRun {
    public static void main(String[]args) {
        ButtonTest buttonTest = new ButtonTest();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, would you like to change the state of the button?");
        String input = scan.next();
        if(input.equals("y")) {
            System.out.println("Please type a string you would like the new state to be");
            String in2 = scan.next();
            buttonTest.push();
        }
        else if(input.equals("n")) {
            System.out.println("The Program will now end");

        }
    }

}
