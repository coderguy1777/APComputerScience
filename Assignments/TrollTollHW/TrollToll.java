package TrollTollHW;

public class TrollToll {
    public int total;
    public String trollname;
    static int totalsum = 0;
    static double banktotal = 0;


    // Sets up the basic constructors for the class for the troll tolls.
    public TrollToll(String t, int tot, int totsum, double collecti) {
        total = tot;
        trollname = t;
        totalsum = tot;
        banktotal = collecti;
    }

    // Method that sets the sum of the trolls bank account to specified amount.
    public int getTotal() {
        return total;
    }

    // Collection Method for Collecting money for tolls.
    public void collect(int collection) {
        total = total + collection;
    }

    // Returns the totalsum of all the money the troll has collected
    public int getTotalsum(int totalsum) {
        totalsum = total;
        return totalsum;
    }

    // Sets the total sum for the troll tolls collected to 0.
    public void emptysum() {
        total = 0;
    }

    // Sets the total bank sum for the money the troll has collected.
    public void banksum( ) {
        System.out.println("This troll, " + this.trollname + " has this much in there account: " + getTotalsum(totalsum));
    }
}
