package lecture15;

// ArrayList

import java.util.ArrayList;
import java.util.Collections;

public class question3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        // auto-boxing
        list.add(1);
        list.add(-19);
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());

        // adding to the array at a specific location
        // size: 0 to size
        list.add(1, 20);
        System.out.println(list);

        // removing from array
        // size: 0 to (size - 1)
        list.remove(1);
        System.out.println(list);

        list.add(101);
        list.add(102);
        System.out.println(list);

        // get
        System.out.println(list.get(2));
        System.out.println(list);

        // sorting the arraylist
        Collections.sort(list);
        System.out.println(list);

        // growing of arraylist is by 1.5

    }
}
