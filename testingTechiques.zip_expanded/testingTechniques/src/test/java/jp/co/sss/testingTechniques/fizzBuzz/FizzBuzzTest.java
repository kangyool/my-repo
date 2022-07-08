package jp.co.sss.testingTechniques.fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@DisplayName("引数が3の場合、期待値としてFizzが返却される")
	@Test
	void testDoFizzBuzz01() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.doFizzBuzz(3));
	}

	@DisplayName("引数が5の場合、期待値としてBuzzが返却される")
	@Test
	void testDoFizzBuzz02() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.doFizzBuzz(5));
	}

	@DisplayName("引数が15の場合、期待値としてFizzBuzzが返却される")
	@Test
	void testDoFizzBuzz03() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz", fizzBuzz.doFizzBuzz(15));
	}

	@DisplayName("引数が4の場合、期待値として4が返却される")
	@Test
	void testDoFizzBuzz04() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("4", fizzBuzz.doFizzBuzz(4));
	}

}
