package ueb07;


import org.apache.logging.log4j.util.PropertySource;

import java.util.Comparator;



public class Sortieren  {
    static <T> T[] swap(T [] arr, int a, int b){

        if(arr.length < 1){
            return arr;
        }
        T hilf = arr[a];
        arr[a] = arr[b];
        arr[b] = hilf;
        return arr;
    }


    static <T extends Comparable<T>> void bubbleSort(T[]arr){
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

    static <T> void bubbleSort(T [] arr, Comparator n){
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

    static class NameComparator implements Comparator<Student>{
        public int compare(Student a, Student b){
            if(a.getName().equals(b.getName())){
                return  Integer.compare(a.getMatrikel(), b.getMatrikel());
            }
            else {
                return a.getName().compareTo(b.getName());
            }
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
