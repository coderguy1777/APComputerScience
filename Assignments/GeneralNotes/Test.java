package GeneralNotes;
import java.util.*;

public class Test {
    public double[][]mata;
    public double[][]matb;
    public int rowval;
    public int colval;
    public Test(int r, int c) {
        this.rowval = r;
        this.colval = c;
        mata = new double[r][c];
        matb = new double[r][c];
    }
    public static void main(String[]args) {
        Test matrixa = new Test(4, 4);
        Test matrixb = new Test(4, 4);
        int count = 0;
        int count2 = 0;
        Test matrixc = new Test(matrixa.rowval, matrixa.colval);
        for(int z = 0; z < matrixa.rowval; z++) {
            count++;
            for(int g = 0; g < matrixa.colval; g++) {
                matrixa.mata[z][g] = (count * 2);
            }
        }
        for(int zz = 0; zz < matrixb.rowval; zz++) {
            count2++;
            for(int gg = 0; gg < matrixb.colval; gg++) {
                matrixb.mata[zz][gg] = (count2 * 2);
            }
        }
        for(int i = 0; i < matrixa.rowval; i++) {
            for(int j = 0; j < matrixb.colval; j++) {
                for(int k = 0; k < matrixc.mata[0].length; k++) {
                    matrixc.mata[i][j] += matrixa.mata[i][j] * matrixb.mata[j][k];
                    System.out.println(matrixa.mata[i][j]);
                    System.out.println(matrixb.mata[j][k]);
                    System.out.println(matrixc.mata[i][j]);
                    System.out.println('\n');
                }
            }
        }
        for(int z = 0; z < matrixa.rowval; z++) {
            for(int g = 0; g < matrixa.colval; g++) {
                System.out.println("Index 1: " + z + "Index 2:" + " " + g + "Matrix a: " + matrixa.mata[z][g] + "  " + " Matrix b: " + matrixb.mata[z][g] + " = " + matrixc.mata[z][g]);
                System.out.println("     ");
                System.out.println(matrixc.mata[z][g]);
            }
        }
    }
}
