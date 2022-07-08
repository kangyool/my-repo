//2022-07-08 14:20 test1


package jp.co.sss.testingTechniques.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(path = "/")
	public String index() {

		return "hi!";
	}

}
