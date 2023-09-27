import java.util.Scanner;

public class lecture12 {
    public static int sum_of_digits(int n){
        int sum_of_digits_val = 0;
        while(n > 0){
            sum_of_digits_val += n%10;
            n /= 10;
        }
        return sum_of_digits_val;
    }

    public static boolean isPrime(int n) {
        boolean is_prime = true;

        for(int i = 2; i*i <= n; i++) {
            if(n%i==0) {
                is_prime = false;
                break;
            }
        }

        return is_prime;
    }

    public static int getIndex(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static int find_freq(int []a, int n) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == n) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // System.out.println(sum_of_digits(n));
        // System.out.println(isPrime(n));
        // int []array = {1,2,3,6,6,6,6,4,6,5,6};
        // System.out.println(getIndex(array, 6));
        // System.out.println(find_freq(array, 6));
        int rows = in.nextInt();
        int cols = in.nextInt();
        int [][]array = new int[rows][cols];
        System.out.print("Intput the array - \n");
        for(int i = 0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = in.nextInt();
            }
        }
        System.out.print("\nYour array was - \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
