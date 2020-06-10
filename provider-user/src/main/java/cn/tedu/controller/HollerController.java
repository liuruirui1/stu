package cn.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HollerController {
	@RequestMapping("/holle/{name}")
	public String Holle(@PathVariable String name) {
		return "1 SpringBoot Holle "+name;
	}
}
