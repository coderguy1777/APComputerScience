package ButtonInterface;

public class ButtonImplement implements Button {
    private int statwe = 0;
    @Override
    public void push() {
        statwe++;
    }

    @Override
    public String state() {
        return "Je;;-p" + statwe;
    }
}
