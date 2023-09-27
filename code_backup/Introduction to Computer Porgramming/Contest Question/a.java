public class a {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * 
         * 1
         * 2 4
         * 3 5 7
         * 6 8
         * 9
         * 
         */
        int [][]a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int n = a.length;
        int m = a[0].length;

        for(int i = 0; i < 2*n; i++) {
            int diagonal_sum = 0;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    if(i==j+k) {
                        System.out.print(a[j][k] + " ");
                        diagonal_sum += a[j][k];
                    }
                }
            }
            // System.out.println(diagonal_sum);
        }




    }    
}
