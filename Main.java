import item_3.MergeAlgorithm;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        Integer[] setA = {29, 24, 23, 22, 9, 3}, setB = {30, 28, 24, 16, 15, 13};
        MergeAlgorithm merge_algorithm = new MergeAlgorithm(setA, setB, true);

        System.out.println(Arrays.toString(merge_algorithm.merge()));
    }
}
