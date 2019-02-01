public class Matrix {
    public int rowsize;
    public int columnsize;
    public int[][] matrix = new int[rowsize][columnsize];
    public Matrix(int rowsize, int columnsize) {
        this.rowsize = rowsize;
        this.columnsize = columnsize;
        matrix = new int[rowsize][columnsize];
    }

    public void setmatrixvals(int rowsize, int columnsize, double matrixcellval) {
        int r = rowsize;
        int c = columnsize;
        double mcellval =  matrixcellval;
        matrix[rowsize][columnsize] = (int)mcellval;
    }

    public int[][] getMatrix() {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 1; j < matrix.length; j++) {

            }
        }
        return matrix;
    }

    public void getCellVal(int row, int col) {
        System.out.println(matrix[row][col]);
    }
}