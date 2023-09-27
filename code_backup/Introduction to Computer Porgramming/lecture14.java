public class lecture14 {

    public static void diagonal(int[][] mat){
        
    }

    public static void Product(int[][] a, int[][] b) {
        int p = a.length;
        int q = a[0].length;
        int r = b.length;
        int s = b[0].length;
        if(p != q) {
            System.out.println("Invalid input");
            return;
        }

        int[][] res = new int[p][s];

        for(int i = 0; i < p; i++) {
            for(int j = 0; j < s; j++) {
                for(int k = 0; k < r; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        print(res);
    }

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




        for(int i = 0; i < r; i++) {
            int left = 0;
            int right = c-1;
            while(left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
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
        int [][]mat = {{1,2},{3,4}};
        int [][]mat2 = {{1},{2}};
        // int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] mat2 = {{10,11,12},{13,14,15}};
        // int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int[][] mat = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        // print(mat);
        // Transpose(mat);
        // Rotate(mat);
        print(mat);
        print(mat2);
        Product(mat, mat2);
    }
}
