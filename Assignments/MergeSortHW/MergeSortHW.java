package MergeSortHW;

import java.io.*;
import java.util.*;

public class MergeSortHW {

    // ArrayLists for the merge sort, the first input, 2nd two
    // halves of the list.
    // and the last one is the sorted arraylist.
    public static ArrayList<Integer> inputarr = new ArrayList<>();
    private static ArrayList<Integer> half1 = new ArrayList<>();
    public static ArrayList<Integer> half2 = new ArrayList<>();
    public static ArrayList<Integer> finalarr = new ArrayList<>();
    public static int count = 0;

    // Throwing of the file not found exception for the file not being found
    // if that ew
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan;

        // Declaration of file name for scanning data input.
        File file = new File("inputs");
        scan = new Scanner(file);
        while (scan.hasNextLine()) {
            inputarr.add(scan.nextInt());
        }
        scan.close();

        // Execution of methods for the program, and the printing of the final list sorted with merge sort.
        halving(inputarr);
        mergesort(half1, half2);
        System.out.println('\n');
        System.out.println("Inputs: " + inputarr);
        System.out.println("Half 1: " + half1);
        System.out.println("Half 2: " + half2);
        System.out.println("Final Array: " + finalarr);
        System.out.println("Times done: " + (count * Math.log(count / Math.log(count))));
        long start = System.nanoTime();
        System.out.println("Current time: " + (start * Math.log(start)));
    }

    // Method where the input data list is halved for merge sort to later merge back together
    // in this case.
    private static void halving(ArrayList<Integer> inputus) {
        int count = 0;
        for (int i = 0; i < inputus.size(); i++) {
            // Halfs of the tree in lists are declared.

            List<Integer> half1tree = inputus.subList(0, inputus.size() / 2);
            int xx = half1tree.size();
            ArrayList<Integer> test = new ArrayList<>();
            // For sorting the first halve tree

            for (int h = 0; h < half1tree.size() + 1; h++) {
                for (int hh = h; hh < half1tree.size(); hh = hh + 1) {

                    int a = half1tree.get(h);
                    int b = half1tree.get(hh);
                    if (b > a) {
                        Integer indice1 = half1tree.remove(hh);
                        half1tree.add(hh, b);
                        count++;
                    }

                    if (b < a) {
                        Integer indice = half1tree.remove(hh);
                        half1tree.add(h, b);
                        count++;
                    }
                }
            }
            half1.addAll(half1tree);
            // Adding of the sorted values into a list for the merging for the first half of the data.

            // Intiazlation of half2 of the merge sort in this case
            // for the algorithim to function.
            List<Integer> half2tree = inputus.subList(xx, inputus.size());

            // Sorting of the half 2 of the initial arraylist from the new sublist for
            // the 2nd half of the merge sort.
            for (int z = 0; z < half2tree.size() + 1; z++) {
                for (int zz = z; zz < half2tree.size(); zz = zz + 1) {
                    int aa = half2tree.get(z);
                    int bb = half2tree.get(zz);
                    if (bb > aa) {
                        Integer id1 = half2tree.remove(zz);
                        half2tree.add(zz, bb);
                        count++;
                    }
                    if (bb < aa) {
                        Integer id2 = half2tree.remove(zz);
                        half2tree.add(z, bb);
                        count++;

                    }
                }
            }
            half2.addAll(half2tree);

            // Adding of the values from sorted half 2 of the merge sort.
            // into a 2nd arraylist mainly for the merging via a forEach
            // loop in this case for the merging of the lists when they are sorted mainly.
            break;
        }
    }

    // method that executes the merge sort algorithim on the two
    // halfs of the list in this case.
    public static void mergesort(List<Integer>one, List<Integer> two) {
        // Conversion of the first list half into an array.
        int[]ls1 = new int[one.size()];
        for(int i = 0; i < ls1.length; i++) {
            ls1[i] = one.get(i);
            finalarr.add(ls1[i]);
        }
        // Simple tool for debugging I added, has no purpose.
        System.out.println('\n');

        // Conversion of the second list half into an array.
        int[]ls2 = new int[two.size()];
        for(int ii = 0; ii < ls2.length; ii++) {
            ls2[ii] = two.get(ii);
            finalarr.add(ls2[ii]);
        }

        // Algorithim is implemented on the final array list.
        for(int finalsort1 = 0; finalsort1 < finalarr.size(); finalsort1++) {
            for(int finalsort2 = finalsort1; finalsort2 < finalarr.size(); finalsort2 = finalsort2 + 1) {
                int a = finalarr.get(finalsort1);
                int b = finalarr.get(finalsort2);
                System.out.println(a + " " + b + " " + finalarr);
                count++;

                if(b > a) {
                    Integer rev1 = finalarr.remove(finalsort2);
                    finalarr.add(finalsort2, b);
                    count++;
                }

                if(b < a) {
                    Integer rev2 = finalarr.remove(finalsort2);
                    finalarr.add(finalsort1, b);
                    count++;
                }
            }
        }
    }
}