public class MatrixTest {
    public static void main(String[]args) {
        Matrix a = new Matrix(4, 4);
        a.setmatrixvals(2,2, 20.0);
        a.setmatrixvals(0, 1, 98.2);
        a.setmatrixvals(1, 1, 721.1);
        a.getMatrix();
        a.getCellVal(1, 1);
    }
}
