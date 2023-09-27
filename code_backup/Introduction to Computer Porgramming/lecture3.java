import java.util.Scanner;

public class lecture3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int c = in.nextInt();
        // if(a<=b && a<=c) {
        //     System.out.println(a + " is minumum.");
        // } else if(b<=a && b<=c) {
        //     System.out.println(b + " is minumum.");
        // } else {
        //     System.out.println(c + " is minumum.");
        // }

        // int n = in.nextInt();
        // if(n%3==0 && n%5==0) {
        //     System.out.println("FIZZBUZZ");
        // } else if(n%3==0) {
        //     System.out.println("FIZZ");
        // } else if(n%5==0) {
        //     System.out.println("BUZZ");
        // }

        // int i = 100;
        // while(i>=1) {
        //     System.out.println(i);
        //     i = i-1;
        // }

        // i = 2;
        // while(i<200) {
        //     System.out.println(i);
        //     i = i + 2;
        // }

        // int int_1 = in.nextInt();
        // int int_2 = in.nextInt();
        // int i = int_1;
        // if(i%2!=0) {
        //     i = i+1;
        // }
        // while(i <= int_2 ) {
        //     System.out.println(i);
        //     i = i+2;
        // }

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int i = n1;
        while(i<=n2/2){
            System.out.println(i*2);
            i = i+1;
        }

        in.close();
    }
    
}
