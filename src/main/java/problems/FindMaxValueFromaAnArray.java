package problems;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValueFromaAnArray {
    public static void main(String[] args) {
        int MaxValueArray[]={1,4,6,8,30,40,5,6,70,45,45,50};
        int MinValue=MaxValueArray[0];
        int MaxValue=MaxValueArray[0];

        for(int i=0; i<=8; i++){
            //if(MaxValueArray[i] <MinValue) MinValue=MaxValueArray[1];
            if (MaxValueArray[i] > MaxValue) MaxValue=MaxValueArray[i];

        }
        System.out.println("Print the MaxValue: " + MaxValue);
        //System.out.println("Print minValue: " + MinValue);

    }

}
