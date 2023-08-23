ackage com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = new int[]{0,1,4,3,2,2,3};
        int val=4;
        System.out.println(Duplicate_deletion(arr, val));
    }

    public static ArrayList<Integer> Duplicate_deletion(int[]a, int no) {
        ArrayList<Integer> arrL= new ArrayList<>();
        for (int j : a) {
            if (j != no) {
                arrL.add(j);
            }
        }
        return arrL;
    }

}
