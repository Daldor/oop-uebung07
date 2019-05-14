package ueb07;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

	Sortieren sort = new Sortieren();
	@Test
	void testStudent(){
		Student s = new Student(123, "Hans");
		System.out.println(s);

		/*
		T [] test = {7,3,5,6,2,4,1,8};

		System.out.println(Arrays.toString(test));

		System.out.println(Arrays.toString(sort.bsort(test)));
		System.out.println(Arrays.toString(sort.bsort2(test)));

		 */

		assertThrows(IllegalArgumentException.class, () -> s.setName(null));
		assertThrows(IllegalArgumentException.class, () -> s.setMatrikel(-3));
	}
}