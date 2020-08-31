package datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> EmployeeId= new HashMap<String, Integer>();
        EmployeeId.put("john", 325);
        EmployeeId.put("rohn", 324);
        EmployeeId.put("mohn", 321);
        EmployeeId.put("johny", 320);

        for(Map.Entry<String, Integer> entry : EmployeeId.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *
     * */
}
