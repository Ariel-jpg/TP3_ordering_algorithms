import item_3.Merge_algorithm;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        Integer[] setA = {29, 24, 23, 22, 9, 3}, setB = {30, 28, 24, 16, 15, 13};
        Merge_algorithm merge_algorithm = new Merge_algorithm(setA, setB, true);

        System.out.println(Arrays.toString(merge_algorithm.merge()));
    }
}
