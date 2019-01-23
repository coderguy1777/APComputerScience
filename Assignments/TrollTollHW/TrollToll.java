package TrollTollHW;

public class TrollToll {
    public int total;
    public String trollname;
    static int totalsum = 0;
    static int banktotal = 0;


    // Sets up the basic constructors for the class for the troll tolls.
    public TrollToll(String trollname) {
        this.trollname = trollname;
    }

    // Method that sets the sum of the trolls bank account to specified amount.
    public double getTotal() {
        return total;
    }

    // Collection Method for Collecting money for tolls.
    public void collect(int collection) {
        totalsum = totalsum + collection;
    }

    // Returns the totalsum of all the money the troll has collected
    public int getTotalsum(int totalsum) {
        return totalsum;
    }

    // Sets the total sum for the troll tolls collected to 0.
    public static void emptysum() {
        banktotal = 0;
    }

    // Sets the total bank sum for the money the troll has collected.
    public void banksum( ) {
        System.out.println("This troll, " + this.trollname + " has this much in there account: " + totalsum);
    }
}
