package problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {
    public void StringPermutation(String prefix, String str){

        int length=str.length();
        if (length==0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < length; i++) {
            StringPermutation
                    (prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, length));
        }
    }
    public void permutationOf(String str) {
        StringPermutation("", str);
    }
    public static void main(String[] args){
        Permutation p=new Permutation();
        p.permutationOf("ABC");
        p.permutationOf("mat");

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    }
}
