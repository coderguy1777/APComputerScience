package MatrixProject;

public class MatrixTest {
    public static void main(String[]args)  {
        try {
            Matrix a = new Matrix(4, 4);
            Matrix b = new Matrix(4, 4);
            Matrix d = new Matrix(2, 4);
            d.setmatrixvals(0, 0, 2.20);
            d.setmatrixvals(0, 1, 9.21);
            d.setmatrixvals(1, 0, 2.212);
            d.setmatrixvals(1, 1, 5.333);
            d.setmatrixvals(1, 2, 3.1);
            a.setmatrixvals(2, 2, 20.0);
            a.setmatrixvals(0, 1, 98.2);
            a.setmatrixvals(1, 1, 721.12);
            a.setmatrixvals(0, 0, 99.2121);
            b.setmatrixvals(2, 2, 29.38);
            Matrix.sub(a, b);
            Matrix.add(a, b);
            Matrix.mult(a, b);
            Matrix.Transpose(d);
            d.getCellVal(2, 2);
        } catch(MatrixException e) {
            System.out.println(e.getMessage());
        }
    }
}