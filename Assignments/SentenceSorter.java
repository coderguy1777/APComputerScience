import java.util.*;

public class SentenceSorter {
    public static void main(String[]args) {
        // Obtains the input for the program, for the string sorting input.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, type a string to be sorted!");
        String testy = scan.next();

        ArrayList<Character> testsss = new ArrayList<>();
        Map<Character, Integer>testmap = new HashMap<Character, Integer>();
        char[]ch = new char[testy.length()];

        // An integer meant for counting the occurences of each Character in the sentence added.
        int count = 0;

        //Meant for counting the occurences of each letter in the sentence.
        int[]test = new int[256];

        // Sets up the count for the counting array of the
        for(int x = 0; x < testy.length(); x++) {
            test[testy.toLowerCase().charAt(x)]++;
        }

        // Nested for loop for counting the occurrence of each character
        for (int i = 0; i < testy.length(); i++) {
            ch[i] = testy.toLowerCase().charAt(i);
            for (int ii = 0; ii <= i; ii++) {
                if (ch[i] == testy.toLowerCase().charAt(i)) {
                    count++;
                }
            }
            testmap.put(testy.toLowerCase().charAt(i), test[testy.charAt(i)]);
        }

        Set<Map.Entry<Character, Integer>>testset = testmap.entrySet();
        System.out.println("Letter Occurrences:");

        // Prints the Occurrences of each letter in the sentence
        for(Map.Entry< Character,Integer> me: testset) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }
        // Converts the Inputted String into all lowercase letters to ignore cases.
        char[]testlistt = testy.toCharArray();
        Arrays.sort(testlistt);

        //Adds the sorted char array to an arraylist, so it can be printed out all in one line for the final sort.
        for(int i = 0; i < testlistt.length; i++) {
            testsss.add(testlistt[i]);
        }

        //Prints Sorted Sentence, with Punctuation at the end.
        System.out.println("-------------------------------------------------");
        System.out.println("Sorted sentence: " + testsss);
    }
}