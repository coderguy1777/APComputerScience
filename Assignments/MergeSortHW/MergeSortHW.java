package MergeSortHW;
package test;

import java.io.*;
import java.util.*;

public class MergeSortHW {
    public static ArrayList<Integer>inputarr = new ArrayList<>();
    public static ArrayList<List<Integer>> sortarr = new ArrayList<List<Integer>>();
    public static ArrayList<Integer>finalarr = new ArrayList<>();

    public static void main(String[]args)   {
        Scanner scan = null;
        File file = new File("inputs");
        try {
            scan = new Scanner(file);
            while(scan.hasNextLine()) {
                inputarr.add(scan.nextInt());
            }

        } catch (IOException e) {
            System.out.print(e);
        }
        mergeysort(inputarr);
        System.out.println(sortarr);
    }

    public static void mergeysort(ArrayList<Integer>inputus) {
        int count = 0;
        for (int i = 0; i < inputus.size(); i++) {
            count++;
            if (count == inputus.size() / 2) {
                List<Integer> half2tree = inputus.subList(inputus.size() / 2, inputus.size());
                List<Integer> half1tree = inputus.subList(0, inputus.size() / 2);
                int[] half1 = new int[half1tree.size()];
                int[] half2 = new int[half2tree.size()];
                for (int x = 0; x < half1tree.size(); x++) {
                    int xx = half1tree.get(x);
                    half1[x] = xx;
                }

                for (int g = 0; g < half2tree.size(); g++) {
                    int gg = half2tree.get(g);
                    half2[g] = gg;
                }
                for (int z = 0; z < half1.length; z++) {
                    for (int z2 = z; z2 < half1.length; z2 = z + 1) {
                        if (half1[z] != half1[z2]) {
                            half1[z] = half1[z + 1];
                            int half11 = z;
                            half1tree.set(half11, half1[z + 1]);
                            System.out.println(half1tree);
                            break;
                        }
                        for (int v = 0; v < half1tree.size(); v++) {
                            System.out.println(half1tree.get(v));
                        }
                    }
                }
            }
        }
    }
}
