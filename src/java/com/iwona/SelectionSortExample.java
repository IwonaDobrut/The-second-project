package com.iwona;

public class SelectionSortExample {

    void selectionSort(int arr[]){
    int len = arr.length;
    for (int i = 0; i < len - 1; i++){
        // Finding the minimum element in the unsorted part of array
        int min = i;
        for (int j = i + 1; j < len; j++)
            if (arr[j] < arr[min])
                min =j;
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
    // Displays the array elements
    void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main (String args []) {
        SelectionSortExample ob = new SelectionSortExample();
        int arr [] = {12, 5, 10, 15};

        System.out.print("Original array: ");
        ob.printArr(arr);
        // calling method for selection sorting
        ob.selectionSort(arr);
        System.out.print("Sorted array: ");
        ob.printArr(arr);

    }

}
