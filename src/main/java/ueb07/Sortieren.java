package ueb07;



public class Sortieren {
    static Object swap(int [] arr, int a, int b){
        int hilf = arr[a];
        arr[a] = arr[b];
        arr[b] = hilf;
        return arr;
    }

    static int[] bsort(int[] arr){
        int i = 0;
        while (i < arr.length - 1) {
            int j = i + 1;
            if (arr[i] > arr[j]){
                swap(arr, i, j);
                i = j;
            } else {
                swap(arr, i, j);
                i = 0;
            }
        }

        return arr;
    }

    static int [] bsort2(int[]arr){
        int i = 0;


        return arr;
    }
}
