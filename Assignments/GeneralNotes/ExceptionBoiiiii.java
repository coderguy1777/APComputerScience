package GeneralNotes;

import java.util.*;
import java.io.*;

public class ExceptionBoiiiii {
    public static void main(String[]args ) {
        Scanner scan;
        try {
            scan = new Scanner(new BufferedReader(new FileReader(("Inputs"))));
            while(scan.hasNext()) {
                try {
                    System.out.println(scan.nextInt());
                } catch(InputMismatchException e) {
                    scan.next(); // Works if file type isnt int for a mismatch exception in the reading of a file in this case.
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("YOU DUMB XDDDDDDDDDDDD" + e.getMessage()); // Is called only if the file selected is not found in this case.
        }

        // Implementation of the Custom Exception with the custom exception class, and
        // Allows for the method testing that exception to be called if it meets the conditons that were met within
        //
        Exception2 ex = new Exception2();
        ex.x = 9;
        try {
            ex.somemeth();
        } catch(CustomException E) {
            System.out.println(E.getMessage());
        }
    }
}