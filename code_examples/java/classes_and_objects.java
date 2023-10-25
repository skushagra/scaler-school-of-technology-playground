import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Data Abstraction - Hide complex details and show only what is required.
        // Key concept of Object Oriented Programming
        
        Matrix x = new Matrix(2, 2);
        x.input();

        Matrix y = new Matrix(2, 2);
        y.input();

        Matrix res = y.add(x);

        res.print();


    }
}

class Matrix {
    int rows;
    int cols;
    int[][] mat;

    Matrix(int r, int c) {
        rows = r;
        cols = c;
        mat = new int[r][c];
    }

    void input() {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                mat[i][j] = in.nextInt();
            }
        }
    }

    Matrix add(Matrix a) {
        Matrix sum = new Matrix(rows, cols);
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum.mat[i][j] = a.mat[i][j] + mat[i][j];
            }
        }
        return sum;
    }

    void print() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
