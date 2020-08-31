package datastructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> address = new HashSet<String>();
        address.add("89-14 34th ave");
        address.add("87-14 34th ave");
        address.add("84-14 34th ave");
        address.add("80-14 34th ave");
        address.add("88-14 34th ave");

        for (String ad : address) {
            System.out.println(ad);

        }
    }
}

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */

