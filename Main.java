import item_1.MainItem1;
import item_2.BubbleSorter;
import item_2.InsertionSorter;
import item_2.SelectionSorter;
import item_3.MergeAlgorithm;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] setA = {29, 24, 23, 22, 9, 3}, setB = {30, 28, 24, 16, 15, 13};
        MergeAlgorithm merge_algorithm = new MergeAlgorithm(setA, setB, true, true);

        System.out.println("Merge: \n" + Arrays.toString(merge_algorithm.merge()));

        Integer[] array1 = Main.randomGen();
        BubbleSorter bubble = new BubbleSorter();
        bubble.sort(array1);
        Integer[] array2 = Main.randomGen();
        SelectionSorter selection = new SelectionSorter();
        selection.sort(array2);

        Integer[] array3 = Main.randomGen();
        InsertionSorter insertion = new InsertionSorter();
        insertion.sort(array3);
        Integer[] array4 = Main.randomGen();
        selection.recursiveSort(array4, 0);

        System.out.println("Bubble Sort: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Selection Sort: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println("Insertion Sort: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }

        System.out.println("Recursive Insertion Sort: ");
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }

        MainItem1 mainItem1 = new MainItem1();
        mainItem1.displayAlgorithms();

    }

    public static Integer[] randomGen() {
        Random rand = new Random();
        int size = rand.nextInt(15);
        Integer[] array = new Integer[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(101);
        }
        return array;
    }
}