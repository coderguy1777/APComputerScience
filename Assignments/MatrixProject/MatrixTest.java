package MatrixProject;
public class MatrixTest {
    public static void main(String[]args) {
        try {
            Matrix a = new Matrix(2,3);
            a.set(0, 0, 2.1);
            a.set(0, 1, 1.2);
            a.set(1,0, 1);
            Matrix b = new Matrix(2,3);
            b.set(0,0, 2.1);
            b.set(0, 1, 1.2);
            b.set(1, 0, 1);
            Matrix.mult(a, b);
        } catch (MatrixException e) {
            System.out.println(e.getMessage());
        }
    }
}