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
                inputarr.add(Integer.valueOf(scan.nextLine()));
            }

        } catch (IOException e) {
            System.out.print(e);
        }
        mergeysort(inputarr);
        System.out.println(inputarr);
    }

    public static void mergeysort(ArrayList<Integer>inputus) {
        int count = 0;
        for (int i = 0; i < inputus.size(); i++) {
            count++;
            if (count == inputus.size() / 2) {
                List<Integer> half2tree = inputus.subList(inputus.size() / 2, inputus.size());
                List<Integer> half1tree = inputus.subList(0, inputus.size() / 2);


                for (int z = 0; z < half1tree.size(); z++) {
                    for (int z2 = z; z2 < half1tree.size(); z2++) {
                        if (half1tree.get(z).compareTo(half1tree.get(z2)) > 0) {
                            List<Integer> ic = half1tree.subList(0, half1tree.size()/2);
                            List<Integer> iu = half1tree.subList(half1tree.size()/2, half1tree.size());
                            int half11 = z;
                            half1tree.set(z, half1tree.get(z));
                            System.out.println(ic);
                            System.out.println(iu);

                            if(ic.size() % 2 == 0) {
                                List<Integer>ic4 = ic.subList(0, ic.size()/2);
                                List<Integer>ic5 = ic.subList(ic.size()/2 , ic.size());


                            }

                            if(iu.size() % 2 == 0) {
                                List<Integer>iu4 = iu.subList(iu.size() - iu.size(), iu.size()/2);
                                List<Integer>iu5 = iu.subList(iu.size()/2, iu.size());

                                if(iu4.size() % 2 == 0) {
                                    List<Integer>finalu = iu4.subList(iu4.size() - iu4.size(), iu4.size() - 2);
                                    List<Integer>finau2 = iu4.subList(iu4.size() - 2, iu4.size());
                                    System.out.println(finalu);
                                    System.out.println(finau2);
                                }

                                if(iu5.size() % 2 == 0) {
                                    List<Integer>finalc = iu5.subList(iu5.size() - iu5.size(), iu5.size() - 2);
                                    List<Integer>finalc2 = iu5.subList(iu5.size() - 2,  iu5.size());
                                    System.out.println(finalc);
                                    System.out.println(finalc2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}