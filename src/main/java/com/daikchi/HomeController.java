package com.daikchi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	@RequestMapping("/daikichi")
	public class HomeController {

		
		
		@RequestMapping("")
		public String index() {
			return "Hello World";
		}
		
		@RequestMapping("/today")
		public String today() {
			return "Today you will find luck in all your endeavors!";
		}

		
		@RequestMapping("/tomorrow")
		public String tomorrow() {
			return "Today you will find luck in all your endeavors!";
		}
	

}