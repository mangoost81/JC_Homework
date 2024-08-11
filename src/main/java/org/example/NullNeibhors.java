package org.example;

public class NullNeibhors {

    public boolean zero (int[] arr){
        boolean res = false;
        for (int i = 0; i < arr.length -1; i++) {
            if(arr[i] == 0 & arr[i+1] == 0){
                res = true;
            }

        }
        return res;
    }
}
