package item_1;

public class MainItem1 {
    public MainItem1() {}

    public void displayAlgorithms(){
        Integer[] arrayBinarySearch = {1,14,26,27,29,33,42,54,55,74};
        Integer valueBinarySearch = 74;
        BinarySearch searcher = new BinarySearch();
        System.out.println("Binary:" + searcher.binarySearcher(arrayBinarySearch,valueBinarySearch));

        int[] arraySequentialSearching = {1,14,26,27,29,33,42,54,55,74};
        int valueSequentialSearching = 26;
        SequentialOrdering searcher2 = new SequentialOrdering();

        System.out.println("Sequential:" + searcher2.secuentialSearch(arraySequentialSearching,valueSequentialSearching));
    }
}
