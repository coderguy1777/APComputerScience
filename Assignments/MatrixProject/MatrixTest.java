package MatrixProject;
public class MatrixTest {
    public static void main(String[]args) {
        try {
            Matrix a = new Matrix(2,3);
            a.setmatrixvals(0, 0, 2.1);
            a.setmatrixvals(0, 1, 1.2);
            a.setmatrixvals(1,0, 1);
            Matrix b = new Matrix(3,3);
            b.setmatrixvals(0,0, 2.1);
            b.setmatrixvals(0, 1, 1.2);
            b.setmatrixvals(1, 0, 1);
            Matrix.mult(a, b);
        } catch (MatrixException e) {
            System.out.println(e.getMessage());
        }
    }
}