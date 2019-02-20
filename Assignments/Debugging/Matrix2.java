/**
 * @author Nitin "Like A Sweater" Armstrong
 * @version 4.20
 * Does basic matrix functions (hopefully)
 */
package Debugging;

public class Matrix2 {
    int row;
    int column;
    double[][] array;

    /**
     * Creates a matrix
     *
     * @param row:    the number of rows in  the array
     * @param column: the number of columns in the array
     */
    public Matrix2(int row, int column) {
        this.row = row;
        this.column = column;
        array = new double[row][column];
    }

    /**
     * Sets a value within a certain index of the matrix
     *
     * @param x     the row parameter for the array
     * @param y     the column parameter of the array
     * @param value the value to be inserted into the array
     * @return the matrix
     */
    public void set(int x, int y, double value) throws MatrixException {
        if (x < 0 || x > row || y < 0 || y >= column) {
            throw new MatrixException("Hyperbruh yo shit is null");
        }
        else {
            array[x][y] = value;
        }

    }

    /**
     * This method gets the value in a cell of the matrix
     *
     * @param x The row parameter of the array
     * @param y The column parameter of the array
     * @return the value in a cell of the specific index of the matrix
     */
    public double get(int x, int y) throws MatrixException {
        if (x < 0 || x > row || y < 0 || y > column) {
            throw new MatrixException("Hyperbruh you shit is null");

        }
        return array[x][y];
    }

    /**
     * Adds two Matrices and outputs the resultant.
     *
     * @param One The first matrix
     * @param Two The second matrix
     * @return The output matrix
     */
    public Matrix2 add(Matrix2 One, Matrix2 Two) throws MatrixException {
        if ((One.array == null) || (Two.array == null) || One.array.length > Two.array.length || Two.array.length > One.array.length) {
            throw new MatrixException("Hyperbruh your array is null or it can't be added");
        }
        Matrix2 Three = new Matrix2(row, column);
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                Three.array[x][y] = One.array[x][y] + Two.array[x][y];
            }
        }
        return Three;
    }

    /**
     * Subtracts two Matricies and outputs the resultant, if out of range, returns Matrix exception.
     *
     * @param One The first matrix input
     * @param Two The second matrix input
     * @return the resultant matrix
     */
    public Matrix2 sub(Matrix2 One, Matrix2 Two) throws MatrixException {
        if ((One.array == null) || (Two.array == null) || One.row > Two.row || One.column > Two.column) {
            throw new MatrixException("Hyperbruh your array is null or it can't be subtracted");
        }
        Matrix2 Three = new Matrix2(row, column);
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                Three.array[x][y] = One.array[x][y] - Two.array[x][y];
            }
        }
        return Three;
    }

    /**
     * Performs Matrix multiplication with two matrices
     *
     * @param One The first matrix
     * @param Two The second matrix
     * @return the resultant matrix
     */
    public Matrix2 mult(Matrix2 One, Matrix2 Two) throws MatrixException {
        if ((One.array == null) || (Two.array == null) || One.column != Two.row || Two.column != One.row) {
            throw new MatrixException("u de big dumb dumb");
        }
        Matrix2 Three = new Matrix2(row, column);
        for (int x = 0; x < Three.row; x++) {
            for (int y = 0; y < Three.column; y++) {
                for (int z = 0; z < One.row; z++) {
                    Three.array[x][y] = One.array[x][z] * Two.array[z][y];
                }
            }
        }
        return Three;
    }

    /**
     * Performs scalar multiplication with a matrix and a scalar number
     *
     * @param One       Input matrix
     * @param amplitude the scalar value the matrix is multiplied by
     * @return The resultant matrix
     */
    public Matrix2 mult(Matrix2 One, double amplitude) throws MatrixException {
        if (One.array == null) {
            throw new MatrixException("Hyperbruh your array is null");
        }
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                One.array[row][column] = One.array[row][column] * amplitude;
            }
        }
        return One;
    }

    /**
     * Transposes the inputted matrix
     *
     * @param One Input matrix
     * @return Matrix that is transposed
     */
    public Matrix2 transpose(Matrix2 One) throws MatrixException {
        if (One.array == null) {

        }
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                One.array[x][y] = One.array[y][x];
            }
        }
        return One;

    }

}

/**
 * MatrixException
 * This exception is thrown for any error associated with the
 * methods in the Matrix class.
 *
 * @author Mr. Kramer
 * @version 10/3/2010
 */

