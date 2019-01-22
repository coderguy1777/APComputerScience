import java.util.*;

public class SentenceSorter {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, type a string to be sorted!");
        String testy = scan.next();

        ArrayList<Character> testsss = new ArrayList<>();
        Map<Character, Integer>testmap = new HashMap<Character, Integer>();
        char[]ch = new char[testy.length()];
        int count = 0;
        int[]test = new int[256];

        for(int x = 0; x < testy.length(); x++) {
            test[testy.toLowerCase().charAt(x)]++;
        }

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
        for(int i = 0; i < testlistt.length; i++) {
            testsss.add(testlistt[i]);
        }

        //Prints Sorted Sentence, with Punctuation at the end.
        System.out.println("-------------------------------------------------");
        System.out.println("Sorted sentence: " + testsss);
    }
}