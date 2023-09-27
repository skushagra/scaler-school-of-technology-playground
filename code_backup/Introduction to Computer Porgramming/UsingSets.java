import java.util.HashSet;

public class UsingSets {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(6); // add int to set
        
        set.clear(); // remove all elements from array
        
        set.add(4);
        set.add(5);
        set.add(6);

        set.contains(5); // check if int is in the set

        set.isEmpty();

        set.remove(5); // remove int from set

        set.size(); // returns the length of set

    }
    
}
