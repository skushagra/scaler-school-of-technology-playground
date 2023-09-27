public class rotatematrix {
    public static void print(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void Rotate(int[][] mat) {
        Transpose(mat);
        int r = mat.length;
        int c = mat[0].length;
        for(int i = 0; i< r; i++){
            for (int j = 0; j < c/2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][c-j-1];
                mat[i][c-j-1] = temp;
            }
        }
        print(mat);
    }

    public static void Transpose(int[][] mat){

        int r = mat.length;
        int c = mat[0].length;

        for(int i = 0; i < r; i++) {
            for(int j = i; j < c; j++) {
                if(i==j) {
                    continue;
                } else {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
        return;
    }
    
    public static void main(String[] args) {
        int [][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(mat);
        System.out.println();
        Rotate(mat);

    }
}
