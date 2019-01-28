import java.util.ArrayList;

public class TrollToll {
    public static int total;
    public String trollname;
    static int totalsum = 0;
    static double banktotal = 0;
    public static ArrayList<String>TrollNames = new ArrayList<>();
    
   
    // Sets up the basic constructors for the class for the troll tolls.
    public TrollToll(String t) {
        trollname = t;
        TrollNames.add(t);
    }

    // Method that sets the sum of the trolls bank account to specified amount.
    public static int getTotal() {
        return total;
    }

    // Collection Method for Collecting money for tolls.
    public static void collect(int collection) {
        total = total + collection;
    }

    // Returns the totalsum of all the money the troll has collected
    public static int getTotalsum() {
        totalsum +=  total;
        return totalsum;
    }

    // Sets the total sum for the troll tolls collected to 0.
    public static void emptysum() {
        total = 0;
    }

    // Sets the total bank sum for the money the troll has collected.
    public void banksum( ) {
    	for(int i = 0; i < TrollNames.size(); i++) {
    		System.out.println("This troll, " + TrollNames.get(i) + " has this much in there account: " + getTotal());
    		System.out.println("The Bank Sum: " + TrollToll.getTotalsum());
    	}
    }
}