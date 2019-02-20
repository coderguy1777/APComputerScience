package TrollTollHW;
import java.util.Scanner;

public class MainTrollToll {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type the name of a troll you would like to collect money!");
        String name = scan.next();

        TrollToll toll = new TrollToll(name, 1, 2, 2.2);
        System.out.println(toll.getTotal());
        boolean running = true;
        while(running) {
            System.out.println("Type 1 to collect money, or 2 to get your sum and exit the collection fun!");
            int input = scan.nextInt();
            if(input == 1) {
                toll.collect(5);
            }
            if(input == 2) {
                toll.banksum();
                toll.getTotal();
                break;
            }
        }
    }
}
