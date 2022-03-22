package item_1;

public class BinarySearch {
    public int binarySearcher(Integer[] array, Integer valueToSearch){
    return binarySearcherAuxiliar(0,array.length - 1,array, valueToSearch);
    }
    private int binarySearcherAuxiliar(Integer low,Integer high,Integer[] array,Integer valueToSearch){
        if (low > high) return -1;
        int middle = (high + low) / 2;
        int cmp = valueToSearch.compareTo(array[middle]);
        if (cmp > 0){
            return binarySearcherAuxiliar(middle +1,high,array,valueToSearch);
        }
        if (cmp < 0){
            return binarySearcherAuxiliar(low, middle - 1, array, valueToSearch);
        }
        else{
            return middle;
        }
    }
}
