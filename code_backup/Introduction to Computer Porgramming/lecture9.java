/**
 * lecture9
 */
import java.util.Scanner;

public class lecture9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Print Diamond pattern of height n
        
        // int n = in.nextInt();
        // n /= 2;
        
        // for(int i = n; i >0; i-- ) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for(int j = 0; j < 2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // for(int i = 1; i <= n; i++ ) {
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for(int j = 2*(n-i); j> 0; j--) {
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // print a star pattern
        int n = in.nextInt();
        for(int i =n/2; i > 0 ; i--){
            for(int j = 1; j <= 2*i; j++) {
                System.out.print("_");
            }
            System.out.println();
        }

        in.close();
    }
}