import java.util.Scanner;

public class lecture5 {

    public static void main(String []args) {
        Scanner in = new Scanner(System.in);

        // check if given tc numbers are prime or not
        // int tc = in.nextInt();
        // for(int i = 0; i < tc; i++) {
        //     int n = in.nextInt();
        //     int count_factors = 0;
        //     for(int j = 1; j <= n; j++){
        //         if(n%j==0) {
        //             count_factors++;
        //         }
        //     }
        //     if(count_factors == 2) {
        //         System.out.println("Prime");
        //     } else {
        //         System.out.println("Not Prime");
        //     }
        // }

        
        // print all prime numbers between two numbers
        // int ul = in.nextInt();
        // int ll = in.nextInt();
        // for(int i = ul; i <= ll; i++){
        //     int count_factors = 0;
        //     for(int j =1; j <= i; j++) {
        //         if(i%j==0) {
        //             count_factors++;
        //         }
        //     }
        //     if(count_factors == 2){
        //         System.out.println(i);
        //     }
        // }

        // Optimized approach to check if a number is prime or not
        // int n = in.nextInt();
        // boolean flag = true;
        // for(int i = 2; i*i <=n; i++) {
        //     if(n%i==0) {
        //         flag = false;
        //     }
        // }
        // if(flag) {
        //     System.out.println("Prime");
        // } else {
        //     System.out.println("Not Prime");
        // }

        // Find the GCD of two numbers given first number is always greater than second
        // int gcd_to_check_1 = in.nextInt();
        // int gcd_to_check_2 = in.nextInt();
        // int gcd = 0;
        // for(int i = 1; i <= gcd_to_check_1; i++){
        //     if(gcd_to_check_1%i==0 && gcd_to_check_2%i==0) {
        //         gcd = i;
        //     }
        // }
        // System.out.println(gcd);

        // printing pattern : n lines of n stars each
        // int number_of_lines = in.nextInt();
        // for(int i = 0; i < number_of_lines; i++){
        //     for(int j = 0; j < number_of_lines; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Find LCM of 2 numbers a and b
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int lcm = 0;
        // for(int i = 1; i <= a*b; i++){
        //     if(i%a==0 && i%b==0) {
        //         lcm = i;
        //         break;
        //     }
        // }
        // System.out.println(lcm);
        






        
        in.close();
    }
    
}
