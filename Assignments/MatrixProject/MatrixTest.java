public class MatrixTest {
    public static void main(String[]args) {
        try {
            Matrix a = new Matrix(4, 4);
            a.setmatrixvals(2, 2, 20.0);
            a.setmatrixvals(0, 1, 98.2);
            a.setmatrixvals(1, 1, 721.1);
            a.setmatrixvals(0,2, 2.0);
            a.getCellVal(1, 1);
            Matrix b = new Matrix(4,4);
            b.setmatrixvals(2,2, 9.12);
            b.setmatrixvals(0,1, 9.1213);
            b.setmatrixvals(1,1, 12.22);
            Matrix.mult(a, b);
            Matrix.matprint(a, b);
        } catch (MatrixException e) {
            System.out.println(e.getMessage());
        }
    }
}
