package TP3_ordering_algorithms.item_2;

/*Este algoritmo busca el numero maximo en un arreglo y lo intercambia de lugar
con el primer numero no ordenado, luego ignora las posisiones ya ordenadas y vuelve
a repetir el primer paso*/

public class SelectionSorter implements Sorter{
    @Override
    public void sort(Integer[] array) {
        for(int i = 0; i < array.length -1; i++){
            int max = max(array, i)[0];
            int maxPosition = max(array, i)[1];
            int lower = array[i];
            array[i] = max;
            array[maxPosition] = lower;
        }
    }

    public void recursiveSort(Integer[] array, int index){
        if(index != array.length){
            int max = max(array, index)[0];
            int maxPosition = max(array, index)[1];
            int lower = array[index];
            array[index] = max;
            array[maxPosition] = lower;
            recursiveSort(array, index+1);
        }}

    private int[] max(Integer[] array, int index) {
        int max = 0;
        int maxPosition = 0;
        for (int i = index; i < array.length ; i++) {
            if (max < array[i]) {
                max = array[i];
                maxPosition = i;
            }
        }
        return new int[]{max, maxPosition};
    }
}