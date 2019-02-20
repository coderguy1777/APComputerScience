package ButtonInterface;

import java.io.IOException;
import java.util.ArrayList;

public class ButtonImplement implements Button {

    public ArrayList<String> mainlist = new ArrayList<>();
    @Override
    public void push() {

        //Url Array of the Strings for the urls.
        String[]urls = new String[5];
        urls[0] = "https://www.youtube.com/watch?v=7h9V0nDT9XU";
        urls[1] = "https://www.youtube.com/watch?v=6AquCxg1Fxw";
        urls[2] = "https://www.youtube.com/watch?v=BuqLz3qWNpw";
        urls[3] = "https://www.youtube.com/watch?v=Ia14i5M31xg";
        urls[4] = "https://www.youtube.com/watch?v=ig1W48LjI0E";

        // Runs the opening of the sites
        try {
            for(int i = 0; i < urls.length; i++) {
                Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome", urls[i]});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String state() {
        // Random Sentences
        ArrayList<String> randomWords = new ArrayList<>();

        // Adding of them to the arraylist
        randomWords.add("George W. Bush is terrible");
        randomWords.add("Ur gey lul");
        randomWords.add("You are terrible");
        randomWords.add("You play fortnite, quick someone get the gun he's retarded.");
        randomWords.add("If you use dark theme, you can't code like Saman");

        // Adds them all to the main arraylist for selection later and debug info.
        mainlist.addAll(randomWords);

        // For index selection of words
        double word = Math.random() * randomWords.size();
        double wordselect = Math.floor(word);
        return randomWords.get((int)wordselect);
    }
}
