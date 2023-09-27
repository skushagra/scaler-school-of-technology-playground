import java.util.Scanner;

public class lecture10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // int []array = new int[n];
        // for (int i = 0; i < n; i++) {
        //     array[i] = in.nextInt();
        // }
        // for (int i = 0; i < n/2; i++) {
        //     int temp = array[i];
        //     array[i] = array[n-i-1];
        //     array[n-i-1] = temp;
        // }
        // for (int i = 0; i < array.length; i++) {
        //     System.out.print(array[i]+ " ");
        // }


        int n = in.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        boolean is_palin = true;
        for (int i = 0; i < n/2; i++) {
            if(array[i] != array[n-i-1]){
                is_palin = false;
            }
        }
        if(is_palin) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        in.close();
    }   
}
