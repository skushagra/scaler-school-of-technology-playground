import java.util.ArrayList;

public class lecture15 {

    public static ArrayList<Integer> return_unique_elements(ArrayList<Integer> nums){
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i =0; i < nums.size(); i++) {
            int count = 0;
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(i)==nums.get(j)){
                    count++;
                }
            }
            if(count==1){
                res.add(nums.get(i));
            }
        }
        return res;
    }


    public static void printDiagonals(int[][] a){
        for (int i = 0; i < a.length+a[0].length-1; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    if(k+j==i) {
                        System.out.print(a[j][k]+" ");
                    }
                }
            }
        }

    }

    public static ArrayList<Integer> even_elements_in_array_using_arraylists(int []a){
        ArrayList<Integer> even_elements = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            if(a[i]%2==0){
                even_elements.add(a[i]);
            }
        }
        return even_elements;
    }

    public static int[] even_elements_in_array(int[] a){
        int ci = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0) {
                ci++;
            }
        }
        int []even_array = new int[ci];
        int rci = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2==0) {
                even_array[rci] = a[i];
                rci++;
            }
        }
        return even_array;
    }

    public static void print(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int [][]mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        // print(mat);
        System.out.println();
        // printDiagonals(mat);

        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(1);
        // al.add(2);
        // al.add(3);
        // al.add(3);
        // al.add(4);
        // al.add(4);
        // System.out.println(return_unique_elements(al));

        ArrayList<ArrayList<ArrayList<Integer>>> ls = new ArrayList<ArrayList<ArrayList<Integer>>>();
        ArrayList<Integer> ls1 = new ArrayList<>();
        ls1.add(1);
        ls1.add(2);
        ls1.add(26);
        ArrayList<Integer> ls2 = new ArrayList<>();
        ls2.add(3);
        ls2.add(5);
        ls2.add(5);
        ArrayList<ArrayList<Integer>> ls3 = new ArrayList<ArrayList<Integer>>();
        ls3.add(ls1);
        ls3.add(ls2);

        ArrayList<Integer> ls4 = new ArrayList<>();
        ls4.add(10);
        ls4.add(12);
        ls4.add(326);
        ArrayList<Integer> ls5 = new ArrayList<>();
        ls5.add(30);
        ls5.add(53);
        ls5.add(105);
        ArrayList<ArrayList<Integer>> ls6 = new ArrayList<ArrayList<Integer>>();
        // ls6.add(ls4);
        // ls6.add(ls5);

        ls.add(ls3);
        ls.add(ls6);
        
        // System.out.println(ls);

        ArrayList<ArrayList<Integer>> ld = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> ld2 = new ArrayList<ArrayList<Integer>>();
        ld2.addAll(ld);


    }
}
