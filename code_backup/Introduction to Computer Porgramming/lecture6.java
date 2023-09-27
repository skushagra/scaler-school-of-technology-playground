import java.util.Scanner;


public class lecture6 {
    

    public static void main(String[] args) {    
        Scanner in = new Scanner(System.in);
        
        // Calculate if a number is Armstrong
        // int n = in.nextInt();
        // for(int i = 1; i <= n; i++) {
        //     int nc = i;
        //     int sum_of_cubes = 0;

        //     while(nc > 0) {
        //         int last_digit = nc%10;
        //         sum_of_cubes = sum_of_cubes + (last_digit*last_digit*last_digit);
        //         nc = nc/10;
        //     }

        //     if(sum_of_cubes == i) {
        //         System.out.println(i);
        //     }
        // }

        // Print difference between first and last digit of a number
        // int n = in.nextInt();
        // int last_digit = n%10;
        // int nc = n;
        // int rn = 0;
        // while(nc > 0){
        //     rn = rn*10 + nc%10;
        //     nc = nc/10;
        // }
        // int first_digit = rn%10;
        // System.out.println(last_digit-first_digit);

        // Print all prime numbers between a and b
        // int ul = in.nextInt();
        // int ll = in.nextInt();
        // int sum_of_primes = 0;
        // for(int i = ul; i <= ll; i++) {
        //     boolean is_prime = true;
        //     for(int j = 2; j*j <= i; j++) {
        //         if(i%j==0) {
        //             is_prime = false;
        //             break;
        //         }
        //     } 
        //     if(is_prime) {
        //         sum_of_primes += i;
        //     }
        // }
        // System.out.println("SUM OF PRIMES : "+ sum_of_primes);

        // Calculate prime factors of a number

        // int n = in.nextInt();
        // int running_factor = 2;
        // System.out.print("PRIME FACTORS OF "+n+" are ");
        // while(n>1) {
        //     if(n % running_factor == 0) {
        //         System.out.print(running_factor+ " ");
        //         n = n/running_factor;
        //     }
        //     else {
        //         running_factor++;
        //     }
        // }



        // Print the prime factorization of a all numbers between a and b
        // int ul = in.nextInt();
        // int ll = in.nextInt();

        // for(int i = ul; i <=ll; i++) {
        //     int nc = i;
        //     int running_factor = 2;
        //     System.out.print(i + " : ");
        //     while(nc > 1) {
        //         if(nc%running_factor == 0) {
        //             System.out.print(running_factor + " ");
        //             nc = nc/running_factor;
        //         } else {
        //             running_factor++;
        //         }
        //     }
        //     System.out.println();
        // }


        // Calculat ethe factorial of a number
        // int n = in.nextInt();
        // int factorial = 1;
        // for(int i =2; i<=n; i++) {
        //     factorial = factorial * i;
        // }
        // System.out.println(factorial);

        // Calculate the factorial of all number till n
        // int n = in.nextInt();
        // for(int i = 1; i<=n; i++) {
        //     int factorial_of_i = 1;
        //     for(int j =1; j <= i; j++) {
        //         factorial_of_i = factorial_of_i * j;
        //     }
        //     System.out.println(i+" : "+ factorial_of_i);
        // }

        // find the number of zeros
        long n = in.nextLong();
        int divisor = 5;
        long count_of_zeros = 0;
        while((n/divisor)>0) {
            count_of_zeros = count_of_zeros +  n/divisor;
            divisor = divisor*5;
        }
        System.out.println(count_of_zeros);


        
        
        in.close();
    }


}
