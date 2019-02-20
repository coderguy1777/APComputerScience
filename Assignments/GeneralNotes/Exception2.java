package GeneralNotes;

public class Exception2 {
    int x = 2;
    public void somemeth() throws CustomException {
        if(x < 10) {
            throw new CustomException("X < 10");
        }
        else {
            System.out.println("Yes++;");
        }

    }
}
