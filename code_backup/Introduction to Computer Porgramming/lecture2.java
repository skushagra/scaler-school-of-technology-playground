import java.util.*;

public class lecture2 {
    public static void main(String[] args) {
        // System.out.println("Basic Data Types :- ");
        // int x = 10;
        // x=40;
        // System.out.println(x);
        // x=50;
        // System.out.println(x);
        // x = x * 10;
        // System.out.println(x);

        // int a = 10;
        // long b = 1000000000000L;
        // a= (int)b;
        // System.out.println(a);

        // System.out.println("Basic comparison Operators :- ");

        // int q = 10;
        // int w = 3;
        // System.out.println(q>w);
        // System.out.println(q<w);
        // System.out.println(q<=w);
        // System.out.println(q>=w);
        // System.out.println(q==w);
        // System.out.println(q!=w);


        // int e = 23;
        // int r = 45;

        // System.out.println("Logical Operators :- ");

        // System.out.println(q>w && e>r);
        // System.out.println(q>w || e>r);
        // System.out.println(!(q>w));

        // int t=10;
        // int y=20;

        // System.out.println("Some more print statements :- ");
        // System.out.println((t=y) == 20);

        // q = 3;
        // w = 3;
        // e = 45;
        // r = 15;
        // t = 34;

        // System.out.println("If-else statements :- ");

        // int s = 10;
        // int f = 20;
        // if (s == f) {
        //     System.out.println("s is equal to f");
        // } else {
        //     System.out.println("s is not equal to f");
        // }
        
        // System.out.println("Inputing values:- ");

        // Scanner in = new Scanner(System.in);
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int sum = a+b;
        // System.out.println("Sum of "+a+" and "+b+" is "+sum);

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>=b && a>=c) {
            System.out.println(a+" is greatest");
        }
        else if(b>a && b>=c) {
            System.out.println(b+" is greatest");
        }
        else if(c>a && c>b) {
            System.out.println(c+" is greatest");
        }

        in.close();

    }
}
