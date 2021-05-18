package com.dineshrk.codingdrills.algorithms.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsortedArray = {34,2,5,21,76,99,65,45,1,55,-100};
        System.out.print("Before Sorting --> ");
        for(int i : unsortedArray)
            System.out.print(" "+i);

        for(int j=unsortedArray.length;j>0;j--){
            for(int i=0;i<j-1;i++){
                if (unsortedArray[i] > unsortedArray[i+1]) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i+1];
                    unsortedArray[i+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("After Sorting --> ");
        for(int i : unsortedArray)
            System.out.print(" "+i);
    }
}
