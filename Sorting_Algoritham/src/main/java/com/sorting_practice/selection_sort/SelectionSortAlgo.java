package com.sorting_practice.selection_sort;


import com.sorting_practice.helper.Helper;

public class SelectionSortAlgo {

    public static void main(String[] args) {

        Integer[] arr = {5,4,3,2,1};
        int n  = arr.length;

        for(int i = 0; i < n ; i++){

            int miniIndex = i;

            for (int j = i; j < n ; j++){

                if(arr[j] < arr[miniIndex]){
                    miniIndex = j;
                }
            }

            // swap

            int temp = arr[i];
            arr[i] = arr[miniIndex];
            arr[miniIndex] = temp;
        }

        Helper.printArray(arr);


    }
}
