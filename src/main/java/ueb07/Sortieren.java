package ueb07;


import org.apache.logging.log4j.util.PropertySource;

import java.util.Comparator;



public class Sortieren  {
    static <T> void swap(T [] arr, int a, int b){
        T hilf = arr[a];
        arr[a] = arr[b];
        arr[b] = hilf;
    }

    /*
    static <T extends Comparable> void bsort(T[] arr){
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
     */

    static <T extends Comparable<? super T>> void bubbleSort(T[]arr){
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int j = i + 1;
                if (arr[i].compareTo(arr[j]) > 0) {
                    swap(arr, i, j);
                    //i = j - 1;
                }
            }
        }
    }

    static <T extends Sortieren> void bubbleSort(Student[] arr, NameComparator n){
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int j = i + 1;
                if (n.compare(arr[i], arr[j]) > 0){
                    swap(arr, i, j);
                    //i = j - 1;
                }
            }
        }
    }

    static <T extends Sortieren> void bubbleSort(Student[] arr, NameMatComparator n){
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                int j = i + 1;
                if (n.compare(arr[i],(arr[j])) > 0){
                    swap(arr, i, j);
                    //i = j - 1;
                }
            }
        }
    }

    static class NameComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            return a.getName().compareTo(b.getName());
        }
    }

    static class NameMatComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            if(a.getName().equals(b.getName()))
                return a.compareTo(b);
            else
                return a.getName().compareTo(b.getName());
        }
    }

    /*
    public int compare(Student a, Student b){
        return -1 * a.compareTo(b);
    }

     */


}
