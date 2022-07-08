package jp.co.sss.testingTechniques.mockitoMock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyTest {

	@Mock
	Shop shop;

	@InjectMocks
	Company company;

	@Test
	void testShowName() {

		when(shop.getShopName()).thenReturn("シェアードショップ");
		assertEquals("シェアードショップ", company.showName());

	}

}
