package item_2;

/*Este algoritmo recorre el arreglo posision por posision, encuentra el mas grande
 y lo inserta en la primera posicion no ordenada disponible, luego desplaza el resto
 de los numeros un casillero a la derecha hasta sobreescribir el numero ya ordenado.*/


public class InsertionSorter implements TP3_ordering_algorithms.item_2.Sorter {
    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    insert(array, j, i);
                    break;
                }
            }
        }
    }

    private void insert(Integer[] array, int destinationIndex, int valueIndex) {
        int value = array[valueIndex];
        for (int i = valueIndex; i > destinationIndex; i--){
            array[i] = array[i-1];
        }
        array[destinationIndex] = value;
    }
}

