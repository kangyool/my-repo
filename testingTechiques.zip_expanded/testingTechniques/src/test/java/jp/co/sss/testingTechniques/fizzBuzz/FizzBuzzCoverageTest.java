package jp.co.sss.testingTechniques.fizzBuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FizzBuzzCoverageTest {

	@DisplayName("引数3の場合")
	@Test
	void testDoFizzBuzz() {

		// テスト実行
		FizzBuzz fizzBuzz = new FizzBuzz(); // A
		String result = fizzBuzz.doFizzBuzz(3); // B

		// 結果確認
		assertEquals(result, "Fizz");//C

	}

	@DisplayName("引数5の場合")
	@Test
	public void testDoFizzBuzz01() {
		// テスト実行
		FizzBuzz fizzBuzz = new FizzBuzz(); // A
		String result = fizzBuzz.doFizzBuzz(5); // B

		// 結果確認
		assertEquals(result, "Buzz");//C
	}
//
//	@DisplayName("引数15の場合")
//	@Test
//	void testDoFizzBuzz02() {
//		// テスト実行
//		FizzBuzz fizzBuzz = new FizzBuzz(); // A
//		String result = fizzBuzz.doFizzBuzz(15); // B
//
//		// 結果確認
//		assertEquals(result, "FizzBuzz");//C
//	}
//
//	@DisplayName("それ以外の場合")
//	@Test
//	void testDoFizzBuzz03() {
//		// テスト実行
//		FizzBuzz fizzBuzz = new FizzBuzz(); // A
//		String result = fizzBuzz.doFizzBuzz(1); // B
//
//		// 結果確認
//		assertEquals(result, "1");//C
//	}

}
