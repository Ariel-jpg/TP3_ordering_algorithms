package TP3_ordering_algorithms.item_2;

/* Este algoritmo recorre posision por posision un arreglo. Si el numero es mayor al que le
sigue continua, si el numero es menor los intercambia.*/

public class BubbleSorter implements Sorter{
    @Override
    public void sort(Integer[] array) {
        int correctCounter = 0;
        int arrayLength = array.length;
        while (correctCounter != arrayLength - 1) {
            correctCounter = 0;
            for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int lower = array[i];
                    int higher = array[i + 1];
                    array[i] = higher;
                    array[i + 1] = lower;
                } else {
                    correctCounter += 1;
                }
            }
        }
    }
}
