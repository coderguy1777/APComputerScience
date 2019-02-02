package MatrixProject;
/*
 A Java Class that does a matrix for the following operations:
 Adding Matricies, Subtracting, Multiplying, and Scalar Multiplication, Along with tranposing the matrix as well.
 By: @Jordan Hill.
 Period: F
 Date: 2/1/19.
 */
class Matrix {
    // Variables declared for each row in the matrix.
    public int rowsize;
    // Variables declared for 
    public int columnsize;
    private double[][] matrix;

    /*
    @param 1: intakes a matrix row size.
    @param 2: intakes a matrix column size;
    return value: the fully dimensioned matrix being returned for it to be dimensioned
    later on in the program when it has to be.
     */
    public Matrix(int rowh, int colh) {
        this.rowsize = rowh;
        this.columnsize = colh;
        matrix = new double[rowsize][columnsize];
    }


    /*
    @param1: Intakes one value that you want to set the row of the matrix for within
    the matrix you want to use in this case.
    @param2: Intakes a value you specify where you want to set the value to in the matrix,
    in this case for what column you would
     */
    public void setmatrixvals(int row, int col, double matrixcellval) throws MatrixException {
        if(row > rowsize || col > columnsize) {
            throw new MatrixException("Either your rows or columns for a matrix are too small to function properly for this program.");
        }
        else {
            int r = row;
            int c = col;
            matrix[r][c] = matrixcellval;
        }
    }

    public void getCellVal(int row, int col) throws MatrixException {
        if(row > rowsize || col > columnsize) {
            throw new MatrixException("The Selection you have selected is out of bounds!");
        }
        else {
            System.out.println(matrix[row][col]);
        }
    }

    public static Matrix add(Matrix a, Matrix b) throws MatrixException {
        if(a == null || b == null || a.rowsize != b.rowsize || a.columnsize != b.columnsize) {
            throw new MatrixException("These matrices shown cannot be added together.");
        }
        else {
            Matrix c = new Matrix(a.rowsize, a.columnsize);
            System.out.println(" ");
            for (int i = 0; i < c.rowsize; i++) {
                for (int j = 0; j < c.columnsize; j++) {
                    c.matrix[i][j] = a.matrix[i][j] + b.matrix[i][j];
                }
            }
            return c;
        }
    }

    /*
     @param 1: intakes matrix a to be subtracted;
     @param 2: intakes matrix b to be subtracted by matrix a;
     return val: returns the subtracted matrix result in a new
     matrix, matrix c in this case.
     */
    public static Matrix sub(Matrix a, Matrix b) throws MatrixException {
        if(a == null || b == null) {
            throw new MatrixException("Either the first matrix is null, or second matrix is null, and these two cannot be subtracted from each other.");
        }
        else if(a.rowsize > b.rowsize || a.columnsize > b.columnsize) {
            throw new MatrixException("Matrices are both not equal in dimensions! Fix it god damn it, walugi needs u!");
        }
        else {
            Matrix c = new Matrix(a.rowsize, a.columnsize);
            for(int i = 0; i < c.rowsize; i++) {
                for(int j = 0; j < c.columnsize; j++) {
                    c.matrix[i][j] = a.matrix[i][j] - b.matrix[i][j];
                }
            }
            return c;
        }
    }

    public static Matrix mult(Matrix a, Matrix b) throws MatrixException {
        if(a == null || b == null) {
            throw new MatrixException("An element of the matrix is making it null, mult invalid for the matrices used.");
        }
        if(a.rowsize > b.rowsize || a.columnsize > b.columnsize) {
            throw new MatrixException("Matricies are not like dimensions.");
        }
        else {
            Matrix c = new Matrix(a.rowsize, a.columnsize);
            for (int i = 0; i < c.rowsize; i++) {
                for(int j = 0; j < c.columnsize; j++) {
                    c.matrix[i][j] = a.matrix[i][j] * b.matrix[j][i];
                }
            }
            return c;
        }
    }

    public static Matrix scalarMult(Matrix a, int scalarval) throws MatrixException {
        if (a == null) {
            throw new MatrixException("Matrix value is equal to null, cannot be multipled by a scalar.");
        }

        else {
            Matrix c = new Matrix(a.rowsize, a.columnsize);
            for(int i1 = 0; i1 < c.rowsize; i1++) {
                for(int i2 = 0; i2 < c.columnsize; i2++) {
                    c.matrix[i1][i2] = a.matrix[i1][i2] * scalarval;
                }
            }
            return c;
        }
    }

    public static Matrix Transpose(Matrix tval) throws MatrixException{
        if(tval == null) {
            throw new MatrixException("Matrix is null and cannot be transposed.");
        }
        else {
            Matrix transposed = new Matrix(tval.rowsize, tval.columnsize);
            for (int i = 0; i < transposed.rowsize; i++) {
                for (int j = 0; j < transposed.columnsize; j++) {
                    transposed.matrix[i][j] = tval.matrix[j][i];
                }
            }
            return transposed;
        }
    }
}