package Debugging;
/**
 * Matrix Project : General Operations of Matrices
 *
 * @Rishabh Sud
 * @2/18/2019 */
import java.io.*;
import java.util.*;
public class Matrix
{
    double [][] mat;
    public int row;
    public int column;
    /*
     * Constructor w/ Paramters
     * @ param int a = # of Rows
     * @ param int b = # of Columns
     */
    public Matrix(int a, int b) {
        mat = new double [a][b];
        row = a;
        column = b;
    }

    /*
     * Method assigns a particular value to the indicated index
     * @param int a: Row index
     * @param int b: Column index
     * @param double c : Value assigned to index
     */
    public void set(int a, int b, double c) throws MatrixException {
        if( a >= row || b >= column ) {
            throw new MatrixException ("God, you numbered the indices wrong");
        }
        if( a < 0 || b < 0 ) {
            throw new MatrixException ("N E G A T I V E  I N D I C E S  ARE FAKE NEWS");
        }
        mat[a][b] = c;
    }

    /*
     * Method returns value of index
     * @param int a : Row index
     * @param int b : Column Index
     */
    public double get(int a, int b) throws MatrixException {
        if( a >= row || b >= column ) {
            throw new MatrixException ("God, you numbered the indices wrong");
        }
        if( a < 0 || b < 0 ) {
            throw new MatrixException ("N E G A T I V E  I N D I C E S  ARE FAKE NEWS");
        }
        double c = mat[a][b];
        return c;
    }

    /*
     * Method adds two matrices (both have to be the same size)
     * @param Matrix a: Matrix 1
     * @param Matrix b: Matrix 2
     */
    public static Matrix add(Matrix a, Matrix b) throws MatrixException {
        if(a.row != b.row || a.column != b.column) {
            throw new MatrixException("Matrix Size Error");
        }
        if (a == null || b == null) {
            throw new MatrixException("Matrix Null Error");
        }
        Matrix sum = new Matrix (a.row, b.row);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j < a.column; j++) {
                double z = a.get(i,j) + b.get(i,j);
                sum.set(i,j,z);
            }
        }
        return sum;
    }

    /*
     * Method subtracts two matrices (both have to be the same size)
     * @param Matrix a: Matrix 1
     * @param Matrix b: Matrix 2
     */
    public static Matrix sub(Matrix a, Matrix b) throws MatrixException {
        if(a.row != b.row || a.column != b.column) {
            throw new MatrixException("Matrix Size Error");
        }
        if (a == null || b == null) {
            throw new MatrixException("Matrix Null Error");
        }
        Matrix diff = new Matrix (a.row, b.row);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j <a.column; j++) {
                double z = a.get(i,j) + b.get(i,j);
                diff.set(i,j,z);
            }
        }
        return diff;
    }

    /*
     * Method basically multiplies the entire matrix by a scalar value
     * @param Matrix a : Matrix 1
     * @param double b : Scalar Factor
     */
    public static Matrix mult (Matrix a, double b) throws MatrixException {
        if (a == null) {
            throw new MatrixException("Matrix Null Error");
        }
        Matrix result = new Matrix (a.row, a.column);
        for (int i = 0; i < a.row; i++) {
            for (int j = 0; j <a.column; j++) {
                double z = a.get(i,j)*b;
                result.set(i,j,z);
            }
        }
        return result;
    }

    /*
     * Method multiplies a matrix with another matrix
     * @param Matrix a: Matrix 1
     * @param Matrix b: Matrix 2
     */
    public static Matrix mult(Matrix a, Matrix b) throws MatrixException {
        if (a == null || b == null) {
            throw new MatrixException("Matrix Null Error");
        }
        if (a.row != b.column) {
            throw new MatrixException("Cannot Multiply the Matrices");
        }
        Matrix result = new Matrix (a.row, b.column);
        double DotProd =0;
        double temp;
        for(int i = 0; i <a.row; i++) {
            for(int j = 0; j < b.column; j++){
                for(int k = 0; k < a.column; k++) {
                    temp = a.get(i,k) * b.get(k,j);
                    DotProd += temp;
                }
                result.set(i,j, DotProd);
                DotProd = 0;
            }
        }
        return result;
    }
    /*
     * Method Transposes, or inverses the matrix
     * @param Matrix a : Matrix 1
     */
    public static Matrix transpose (Matrix a) throws MatrixException {
        if(a == null) {
            throw new MatrixException("Matrix Null Error");
        }
        Matrix T = new Matrix(a.column,a.row);
        for (int i = 0; i<a.row; i++) {
            for (int j = 0; j<a.column; j++) {
                T.set(j,i,a.get(i,j));
            }
        }
        return T;
    }
}