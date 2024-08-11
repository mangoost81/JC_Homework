package org.example;

public class Is_Even {
    public int evenCount (int[] array) {
        int count = 0;
        for (int elem : array){
            if(elem % 2 ==0){
                count ++;
            }
        }
        return count;
    }
}
