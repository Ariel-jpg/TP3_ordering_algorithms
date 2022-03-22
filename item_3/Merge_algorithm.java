package item_3;

import java.util.Arrays;
import java.util.Objects;

public class Merge_algorithm {
    private Integer[] setA, setB;

    // orderOfSets = false ---> ascending order (smallest to largest)
    // orderOfSets = true ---> descending order (largest to smallest)
    boolean orderOfSets = false;

    // Example struct of sets: setA = [1, 2, 6, 9, 15, 16, 18, 19], setB = [4, 10, 15, 20]
    public Merge_algorithm(Integer[] setA, Integer[] setB){ // TODO -- Only integers or floats too? -- Check
        this.setA = checkRepeatedNumbers(setA, setB);
        this.setB = setB;
    }

    // Example struct of sets: setA = [29, 24, 23, 22, 9, 3], setB = [30, 28, 24, 16, 15, 13]
    public Merge_algorithm(Integer[] setA, Integer[] setB, boolean orderOfSets){ // TODO -- Only integers or floats too? -- Check
        if (orderOfSets) {
            invertArray(setA);
            invertArray(setB);
        } // Check the convention (constructor syntax Java)

        this.setA = checkRepeatedNumbers(setA, setB);
        this.setB = setB;
        this.orderOfSets = orderOfSets;
    }

    public Integer[] merge(){
        int finalLength = setA.length + setB.length;
        int iSetA = 0, iSetB = 0;
        int weightPositionA, weightPositionB;

        Integer[] orderedArray = new Integer[finalLength];

        for (int i = 0; i < orderedArray.length; i++){
            weightPositionA = (iSetA < setA.length) ? setA[iSetA] : setB[setB.length - 1] + 1; // Ternary operator https://lineadecodigo.com/java/el-operador-ternario-en-java/
            weightPositionB = (iSetB < setB.length) ? setB[iSetB] : setA[setA.length - 1] + 1; // The last part of the ternary operator is for the last iteration

            if(weightPositionA < weightPositionB){
                orderedArray[i] = weightPositionA;
                iSetA++;
            }
            else {
                orderedArray[i] = weightPositionB;
                iSetB++;

                if(weightPositionA == weightPositionB) iSetA++;
            }
        }

        if (orderOfSets)
            invertArray(orderedArray);

        return orderedArray;
    }

    private Integer[] checkRepeatedNumbers(Integer[] setToCheck, Integer[] setToCompare){
        Integer[] setTemp = new Integer[setToCheck.length];
        boolean repeat;
        int k = 0;

        for (Integer numberToCheck : setToCheck) {
            repeat = false;

            for (Integer numberToCompare : setToCompare)
                if (Objects.equals(numberToCheck, numberToCompare))
                    repeat = true;

            if (!repeat) {
                setTemp[k] = numberToCheck;
                k++;
            }
        }

        Integer[] finalSet = Arrays.copyOfRange(setTemp, 0, k); // I need to have the exact length of the final set, not the length of the original set. Are potentially different.

        return finalSet;
    }

    private void invertArray(Integer[] array){ // Mutable
        for(int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = temp;
        }
    }
}