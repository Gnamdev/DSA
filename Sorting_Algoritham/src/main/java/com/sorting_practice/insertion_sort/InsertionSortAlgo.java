package com.sorting_practice.insertion_sort;

import com.sorting_practice.helper.Helper;

public class InsertionSortAlgo {
    public static void main(String[] args) {

        Integer[] arr = {4,3,5,2,1};
        int n  = arr.length;

        for(int i=1 ; i < n; i++){

            int j = i - 1;
            int currentElement = arr[i];

            while( j >= 0 && arr[j] > currentElement){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentElement;
        }

        Helper.printArray(arr);

    }
}
