package problems;

public class InvertString {

    /**
     * Invert a String without using String default reverse() method
     *
     * */


    public static void main(String[] args) {
        String x= reverse("silent");
        System.out.println(x);
    }
    public static String reverse(String s) {
        char[] letters = new char[s.length()];

        int letterIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex] = s.charAt(i);
            letterIndex++;
        }
    String reverse ="";
        for(int i=0; i<s.length(); i++){
            reverse= reverse + letters[i];
        }
        return reverse;
    }
}
