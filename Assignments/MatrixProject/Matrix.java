package MatrixProject;
/*
 A Java Class that does a matrix for the following operations:
 Adding Matrices, Subtracting, Multiplying, and Scalar Multiplication, Along with transposing the matrix as well.
 By: @Jordan Hill.
 Period: F
 Date: 2/1/19.
 */

class Matrix {
    // Variables declared for each row in the matrix.
    public int rowsize;
    // Variables declared for the column size in this case for the matrix.
    public int columnsize;
    // 2D Array used for the matrix itself
    public double[][] matrix;

    /*
    @param 1: intakes a matrix row size.
    @param 2: intakes a matrix column size;
    @return value: the fully dimensioned matrix being returned for it to be dimensioned
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
    in this case for what column you would set the value at.
    @return val: sets the the matrix cell value of choice in this case.
    throw: throws an exception if the row or col is greater then the matrix parameters for
    setting the matrix value in this case.
     */
    public void set(int row, int col, double matrixcellval) throws MatrixException {
        if (row > rowsize || col > columnsize) {
            throw new MatrixException("Either your rows or columns for a matrix are too small to function properly for this program.");
        } else {
            int r = row;
            int c = col;
            // sets the inputted value of the matrix for the method in this case equal to the
            // double for the inputted value into the method into that spot of the matrix/
            matrix[r][c] = matrixcellval;
        }
    }

    /*
    @param1: retrieves the row of the wanted value.
    @param2: retrieves the column of the wanted value.
    @return val: returns the wanted matrix value when the
    method is called as well.
     */
    public double get(int row, int col) throws MatrixException {
        if (row > rowsize || col > columnsize) {
            throw new MatrixException("The Selection you have selected is out of bounds!");
        }
        if (row < 0 || col < 0) {
            throw new MatrixException("Hippity Hoppity you cant get the number requested as you typed negative bounds which dont exist, get dabbed on normie, (que dab).");
        }
        // returns the cell value from the wanted spot in the matrix, with minus 1 in order
        // to make it equal to the array parameter in this case.
        return matrix[row - 1][col - 1];
    }

    /*
    @param1: takes in one matrix to be added, and checks whether it is null or not.
    @param2: takes in a second matrix to be added, and checks whether it is null or not
    @return val: returns the added matrix for adding matrix a and matrix b.
     */
    public static Matrix add(Matrix a, Matrix b) throws MatrixException {
        if (a == null || b == null) {
            throw new MatrixException("These matrices shown cannot be added together.");
        } else if (a.rowsize > b.rowsize || a.columnsize > b.columnsize) {
            throw new MatrixException("Matrices are not of equal dimensions, and cannot be added together.");
        } else {
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
     Does subtraction for a matrix in this case, with subtracting matrix a from matrix b.
     @param 1: intakes matrix a to be subtracted;
     @param 2: intakes matrix b to be subtracted by matrix a;
     @return val: returns the subtracted matrix result in a new
     matrix, matrix c in this case.
     */
    public static Matrix sub(Matrix a, Matrix b) throws MatrixException {
        // Checks if either matrix is null and throws an exception if that is the case
        if (a == null || b == null) {
            throw new MatrixException("Either the first matrix is null, or second matrix is null, and these two cannot be subtracted from each other.");
        } else if (a.rowsize > b.rowsize || a.columnsize > b.columnsize) {
            throw new MatrixException("Matrices are both not equal in dimensions! Fix it god damn it, walugi needs u!");
        } else {
            Matrix c = new Matrix(a.rowsize, a.columnsize);
            for (int i = 0; i < c.rowsize; i++) {
                for (int j = 0; j < c.columnsize; j++) {
                    c.matrix[i][j] = a.matrix[i][j] - b.matrix[i][j];
                }
            }
            return c;
        }
    }

    /*
    Does matrix multiplication on two inputted matrices, and spits out a new
    matrix, with both factors multiplied to find that new matrix.
    @param1: intakes one matrix to be multiplied.
    @param2: intakes a second matrix to be multiplied.
    @return: returns a multiplied matrix, which in this case is matrix c for the
    method in question in this case.
     */
    public static Matrix mult(Matrix a, Matrix b) throws MatrixException {
        if (a == null || b == null) {
            throw new MatrixException("An element of the matrix is making it null, mult invalid for the matrices used.");
        }
        if (a.rowsize > b.rowsize || a.columnsize > b.columnsize) {
            throw new MatrixException("Matricies are not like dimensions.");
        } else {
            // Checks for the dimensions o the matrix, to set it to the
            // proper dimensions for matrix c so that each can be multiplied properly in
            // this case mainly.
            int rowvar = 0;
            int colvar = 0;
            // sets up the matrix dimensions for matrix c properly
            if(a.rowsize < b.columnsize) {
                rowvar = a.rowsize;
                colvar = b.columnsize;
            }
            // Establishes the new matrix for the resulting multipled matrix
            Matrix c = new Matrix(rowvar, colvar);
            for(int i =  0; i < c.rowsize; i++) {
                for(int j = 0; j < c.columnsize; j++) {
                    double multiplying = 0.0;
                    if(rowvar == a.rowsize) {
                        for(int z  = 0; z < a.rowsize; z++) {
                            multiplying = multiplying + (a.matrix[i][z] * b.matrix[z][j]);
                        }
                    } else {
                        for(int z2 = 0; z2 < b.rowsize; z2++) {
                            multiplying = multiplying + (a.matrix[i][z2] * b.matrix[z2][j]);
                        }
                    }
                    // takes the resulting answer for the multiplied matrix, and
                    // the double that it was set equal, to be the result of the
                    // the new matrix in this case, with this matrix being
                    // matrix c.
                    System.out.println(multiplying);
                    c.matrix[i][j] = multiplying;
                }
            }
            return c;
        }
    }

    /*
    Does Scalar Multiplication on a matrix when inserted into this method in this case.
    @param1: Takes in one matrix to be multiple by a scalar factor for the scalar matrix multiplication.
    @param2: Takes in a scalar factor for the matrix to be multiplied by, and multiples each value in the matrix by
    that scalar factor in this case.
    @return val: returns the scalar multiplied matrix as a result of being run on the matrix in question.
     */
    public static Matrix scalarMult(Matrix a, int scalarval) throws MatrixException {
        if (a == null) {
            throw new MatrixException("Matrix value is equal to null, cannot be multipled by a scalar.");
        } else {
            Matrix c = new Matrix(a.rowsize, a.columnsize);
            for (int i1 = 0; i1 < c.rowsize; i1++) {
                for (int i2 = 0; i2 < c.columnsize; i2++) {
                    c.matrix[i1][i2] = a.matrix[i1][i2] * scalarval;
                }
            }
            return c;
        }
    }


    /*
    When a matrix is inserted into this method, it trasposes the matrix.
    @param1: intakes the matrix to be transposed in this case.
    @param2: creates a new matrix, with it having the column size set for the tranposal, and
    the row size so it can intake the transposed matrix in this case.
    @return val: returns a transposed matrix, and having it switched the column values as well, and
    as a result, returns a transposed matrix.
     */
    public static Matrix Transpose(Matrix tval) throws MatrixException {
        if (tval == null) {
            throw new MatrixException("Matrix is null and cannot be transposed.");
        } else {
            Matrix transposed = new Matrix(tval.columnsize, tval.rowsize);
            for (int i = 0; i < transposed.rowsize; i++) {
                for (int j = 0; j < transposed.columnsize; j++) {
                    // Sets up the transposed matrix.
                    transposed.matrix[i][j] = tval.matrix[j][i];

                }
            }
            return transposed;
        }
    }
}
class MatrixException extends Exception {
    public MatrixException() {
        super();
    }
    public MatrixException(String s) {
        super(s);
    }
}
