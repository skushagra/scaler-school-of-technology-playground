import java.util.Scanner;

public class lecture4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Program to calculate sum of first n natural numbers
        // int n = in.nextInt();
        // int sum = 0;
        // int counter = 1;
        // while(counter<=n){
        //     sum += counter;
        //     counter++;
        // }
        // System.out.println(sum);


        // Program to calculate sum of odd natural numbers between a and b
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int sum = 0;
        // int counter = a;
        // while(counter<=b){
        //     sum += counter;
        //     counter++;
        // }
        // System.out.println(sum);
        // int c = in.nextInt();
        // int d = c;
        // while(d > 0) {
        //     System.out.println(d%10);
        //     d = d/10;
        // }

        
        // Reverse a number and make some calculations on it
        // int e = in.nextInt();
        // int f = e;
        // int rnum = 0;
        // while(Math.abs(f) > 0){
        //     rnum = (rnum*10) + (f%10);
        //     f = f/10;
        // }
        // System.out.println("Reverse Num - "+rnum);
        // System.out.println("Reverse Num - "+rnum);
        // System.out.println("2 * reverse num = "+2*rnum);
        // System.out.println("orignal + reverse number = "+(e+rnum));
        // System.out.println("Orignal - reverse number = "+(e-rnum));

        // Print the sum of digits of a number
        // int g = in.nextInt();
        // int h = in.nextInt();
        // int sum=0;
        // for(int j = g; j <= h; j=j+1){
        //     sum += j;
        // }
        // System.out.println("Sum of digits = "+ sum);

        // Print the sum of odd digits upto a number
        // int k =1;
        // int l = in.nextInt();
        // int sum_odd = 0;
        // if(k%2==0){
        //     k++;
        // }
        // for(int i = k; i<=l; i=i+2){
        //     sum_odd += i;
        // }
        // System.out.println("Sum of odd digits = " + sum_odd);

        
        // Reverse a number
        // int m = in.nextInt();
        // int mc = m;
        // int rev_num = 0;
        // for(int n = mc%10; mc>0; mc = mc/10,n = mc%10){
        //     rev_num = rev_num*10 + n;
        // }
        // System.out.println("Reverse Number = " + rev_num);


        // Find the square root of a number
        // int o = in.nextInt();
        // for(int i = 0; i < o/2; i++){
        //     if(i*i == o) {
        //         System.out.println("Square Root = " + i);
        //         // break;
        //     }
        // }

        
        // Find the factors of a number
        // int ftp = in.nextInt();
        // for(int i = 1; i <= ftp; i++){
        //    if(ftp%i==0){
        //         System.out.print(i+ " ");
        //    }
        // }


        // Print first and last digit of a given set of number
        // int tc = in.nextInt();
        // while(tc>0){
        //     int n = in.nextInt();
        //     int ln = n%10;
        //     int fn = 0;
        //     int f = n;
        //     int rnum = 0;
        //     while(Math.abs(f) > 0){
        //         rnum = (rnum*10) + (f%10);
        //         f = f/10;
        //     }
        //     fn = rnum%10;
        //     System.out.println(fn+" "+ ln);
        // }

        in.close();

    }
}
