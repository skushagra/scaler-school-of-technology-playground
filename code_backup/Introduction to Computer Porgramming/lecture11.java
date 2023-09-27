import java.util.Scanner;

public class lecture11 {
    public static void main(String[] args) {
        // int []array = {1,2,3,4,5,6,7,8};
        // for (int i = 1; i < array.length; i++) {
        //     array[i] = array[i-1];
        // }
        // array[0] = array[array.length-1];
        // for (int i = 0; i < array.length; i++) {
        //     System.out.print(array[i]+ " ");
        // }

        Scanner in  = new Scanner(System.in);
        // int n = in.nextInt();
        // int array[] = new int[n];
        // for (int i = 0; i < n; i++) {
        //     array[i] = in.nextInt();
        // }
        // int this_val = array[0];
        // boolean flag = true;
        // for(int i = 1; i < n-1; i++) {
        //     if(this_val > array[i]) {
        //         flag = false;
        //         System.out.println("Not Sorted");
        //         break;
        //     }
        //     this_val = array[i];
        // }
        // if(flag) {
        //     System.out.println("Sorted");
        // }

        int n = in.nextInt();
        int oa[] = new int[n];
        for (int i = 0; i < oa.length; i++) {
            oa[i] = in.nextInt();
        }
        int ak[] = new int[n+1];
        int k = in.nextInt();
        int index = 0;
        int min_val = oa[0];
        int max_val = oa[0];
        for(int i = 0; i<n-1; i++) {
            if(oa[i] < k && k < oa[i+1]) {
                index = i+1;
            }
            if (oa[i] < min_val) {
                min_val = oa[i];
            }
            else if(oa[i] > max_val) {
                max_val = oa[i];
            }
        }
        if(k < min_val) {
            index = 0;
        }
        else if(k > max_val) {
            index = n;
        }
        System.out.println(min_val);
        System.out.println(max_val);
        System.out.println(index);
        int oai = 0;
        for(int i = 0; i < n+1; i++) {
            if(i==index) {
                ak[i] = k;
            }else {
                ak[i] = oa[oai];
                oai++;
            }
        }
        for (int i : ak) {
            System.out.print(i+" ");
        }
        in.close();
    }
}
