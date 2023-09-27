import java.util.Scanner;

public class lecture13 {

    public static int[][] mat_transpose(int [][]a) {
        int  transpose[][] = new int[a[0].length][a.length];
        int ci = 0;
        for(int i = 0; i< a[0].length; i++){
            int ri = 0;
            for(int j = 0; j < a.length; j++) {
                transpose[ri][ci] = a[i][j];
                ri++;
            }
            ci++;
        }
        return transpose;
    }

    public static int[][] sum_of_arr(int [][]a, int [][]b) {
        int sum[][] = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    public static int[][] rev_arr(int [][]a) {
        int [][]rev_arr = new int[a.length][a[0].length];
        int ri = 0;
        for(int i = a.length-1; i >=0; i--) {
            int ci = 0;
            for (int j = a[0].length-1; j >=0 ; j--) {
                rev_arr[i][j] = a[ri][ci];
                ci++;
            }
            ri++;
        }
        return rev_arr;
    }

    public static int[] max_of_each(int[][] a) {
        int[] max_arr = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j = 0; j < a[0].length; j++) {
                if( max < a[i][j]) {
                    max = a[i][j];
                }
            }
            max_arr[i] = max;
        }
        return max_arr;
    }

    public static int freq_of_element(int [][]a, int k) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j] == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        // init 2D array
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][]arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
                
            }
        }

        // int [][]arr2 = new int[n][m];
        // for(int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         arr2[i][j] = in.nextInt();
                
        //     }
        // }


        System.out.println();
        int [][]rev = mat_transpose(arr);
        for (int i = 0; i < rev.length; i++) {
            for (int j = 0; j < rev[0].length; j++) {
                System.out.print(rev[i][j]+" ");
            }
            System.out.println();
            
        }

        // int num_to_search = in.nextInt();

        // System.out.println(freq_of_element(arr, num_to_search));
        // for (int is : max_of_each(arr)) {
        //     System.out.print(is + " ");
        // }
        System.out.println();

        // int num_index = -1;
        // for(int i =0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if(arr[i][j] == num_to_search) {
        //             System.out.println((i+1)+" "+(j+1));
        //             num_index = 1;
        //             break;
        //         }
        //     }
        // }
        // if(num_index == -1) {
        //     System.out.println(-1);
        // }
        in.close();
    }
    
}