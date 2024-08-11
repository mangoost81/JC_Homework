package org.example;

public class DifferenceMinMaxElemOfArray {
    public int difference(int[] arr){
        int maxelem = arr[0];
        int minelem = arr[0];
        for (int elem:arr){
            if(elem <= minelem){
                minelem = elem;
            }
            if (elem >= maxelem) {
                maxelem = elem;
            }

        }

        return maxelem - minelem;
    }
}
