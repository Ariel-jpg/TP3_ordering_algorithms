package item_1;

public class SequentialOrdering {
    public int secuentialSearch(int[] array, int valueToSearch){
        int i = 0;
        while (i < array.length)
            if (array[i] == valueToSearch)
                return i;
            else
                i++;
        return -1;
    }
}
