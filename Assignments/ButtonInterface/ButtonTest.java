package ButtonInterface;
import java.io.*;
import java.util.*;

class ButtonTest implements Button {
    ArrayList<String>test = new ArrayList<>();

    public void data() {
        try {
            File file = new File("Data");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                test.add(scan.nextLine());
            }
            scan.close();
        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void push() {
        data();
    }

    public String arrreturn(int i) {
        return test.get(i);
    }

    public String state() {
        return null;
    }
}
