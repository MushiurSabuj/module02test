package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        duplicateWord("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");
        //System.out.println(duplicateWord);
    }
    public static void duplicateWord(String input){
        String words[] = input.split(" ");
        Map<String, Integer> wordCount = new HashMap<String , Integer>();

        for( String word: words){

            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            }
            else {
                wordCount.put(word, 1);
            }
        }
        Set<String>wordsInString = wordCount.keySet();

        for(String word: wordsInString){
            if(wordCount.get(word)>1){
                System.out.println(word + " " + wordCount.get(word));
            }
        }

    }

}
