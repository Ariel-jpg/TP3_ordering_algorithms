package item_1;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayBinarySearch = {1,14,26,27,29,33,42,54,55,74};
        Integer valueBinarySearch = 74;
        BinarySearch searcher = new BinarySearch();
        System.out.println(searcher.binarySearcher(arrayBinarySearch,valueBinarySearch));
        int[] arraySequentialSearching = {1,14,26,27,29,33,42,54,55,74};
        int valueSequentialSearching = 26;
        SequentialOrdering searcher2 = new SequentialOrdering();
        System.out.println(searcher2.secuentialSearch(arraySequentialSearching,valueSequentialSearching));
    }
}
