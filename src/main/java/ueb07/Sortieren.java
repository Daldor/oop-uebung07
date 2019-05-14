package ueb07;



public class Sortieren {
    static <T> void swap(T [] arr, int a, int b){
        T hilf = arr[a];
        arr[a] = arr[b];
        arr[b] = hilf;
    }

    static <T extends Comparable<T>> void bsort(T[] arr){
        int i = 0;
        while (i < arr.length - 1) {
            int j = i + 1;
            if (arr[i].compareTo(arr[j]) == 1){
                swap(arr, i, j);
                i = j;
            } else {
                swap(arr, i, j);
                i = 0;
            }
        }
    }

    static <T extends Comparable<T>> void bubbleSort(T[]arr){
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int j = i + 1;
                if (arr[i].compareTo(arr[j]) == 1) {
                    swap(arr, i, j);
                    //i = j - 1;
                }
            }
        }
    }
}
