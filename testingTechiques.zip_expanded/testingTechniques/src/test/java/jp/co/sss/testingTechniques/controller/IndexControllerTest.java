package jp.co.sss.testingTechniques.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
class IndexControllerTest {

	// Spring MVCインスタンス
	private MockMvc mockMvc;

	// テスト対象のコントローラ
	@Autowired
	IndexController target;

	@BeforeEach
	void setup() {

		// Spring MVCにテスト対象のコントローラを設定する
		this.mockMvc = MockMvcBuilders.standaloneSetup(target).build();
	}

	@Test
	void testIndex() throws Exception {

		// URLが「/」のgetメソッドを実行する
		ResultActions result = mockMvc.perform(get("/"));
		// 画面遷移先が「hello.html」であることを確認する
		result.andExpect(view().name("hello"));
	}

}
