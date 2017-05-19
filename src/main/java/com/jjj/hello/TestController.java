package com.jjj.hello;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/t")
	@ResponseBody
	Map<String, String> test(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("t1", "1");
		map.put("t2", "2");
		map.put("t3", "3");
		return map;
	}
}
