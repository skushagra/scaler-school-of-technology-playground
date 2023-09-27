import java.util.ArrayList;

public class problems { 

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> alta = new ArrayList<Integer>();
        alta.add(4);
        alta.add(5);
        alta.add(1);
        al.add(alta);
        ArrayList<Integer> alta2 = new ArrayList<Integer>();
        alta2.add(4);
        alta2.add(3);
        alta2.add(3);
        al.add(alta2);
        ArrayList<Integer> alta3 = new ArrayList<Integer>();
        alta3.add(3);
        alta3.add(1);
        alta3.add(2);
        al.add(alta3);
        ArrayList<Integer> alta4 = new ArrayList<Integer>();
        alta4.add(2);
        alta4.add(3);
        alta4.add(4);
        al.add(alta4);
        alta4.sort(null);
    }
}
