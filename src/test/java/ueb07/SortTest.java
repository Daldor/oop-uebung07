package ueb07;


import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class SortTest {

    @Test
    void testSwap() {
        Integer[] a = {1, 2, 3};
        Sortieren.swap(a, 0, 1);
        assertEquals(1, (int) a[1]);
        assertEquals(2, (int) a[0]);
        assertEquals(3, (int) a[2]);
    }

    @Test
    void testBuble1() {
        Integer [] a1 ={4,2,3,1};
        Integer[] ref1 = {1, 2, 3, 4};

        Sortieren.bubbleSort(a1);

        System.out.println(Arrays.toString(a1));
        assertArrayEquals(ref1, a1);

        Student s1 = new Student(1, "Sarah");
        Student s2 = new Student(2, "Peter");
        Student s3 = new Student(3, "Anna");
        Student s4 = new Student(4, "Hans");

        Student[] a2 = {s4, s2, s3, s1};
        Student[] ref2 = {s1, s2, s3, s4};

        Sortieren.bubbleSort(a2);
        assertArrayEquals(ref2, a2);
    }
/*
    @Test
    void testBubble2() {
        Student s1 = new Student(1, "Sarah");
        Student s2 = new Student(2, "Peter");
        Student s3 = new Student(3, "Anna");
        Student s4 = new Student(4, "Hans");

        Student[] a2 = {s4, s2, s3, s1};
        Student[] ref2 = {s3, s4, s2, s1};

        Sortieren.bubbleSort(a2,  new NameComparator());
        assertArrayEquals(ref2, a2);
    }

    @Test
    void testBubble3() {
        Student s1 = new Student(1, "Sarah");
        Student s2 = new Student(2, "Sarah");
        Student s3 = new Student(3, "Anna");
        Student s4 = new Student(4, "Hans");

        Student[] a2 = {s4, s2, s3, s1};
        Student[] ref2 = {s3, s4, s1, s2};

        Sortieren.bubbleSort(a2,  new NameMatComparator());
        assertArrayEquals(ref2, a2);
    }

 */

}

