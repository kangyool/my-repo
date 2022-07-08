package jp.co.sss.testingTechniques.mockitoSpy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyTest {

	@Spy
	Shop shop;

	@InjectMocks
	Company company;

	@Test
	void testShowName() {

		when(shop.getShopName()).thenReturn("シェアードショップ");
		assertEquals("シェアードショップ", company.showName());

	}

}
