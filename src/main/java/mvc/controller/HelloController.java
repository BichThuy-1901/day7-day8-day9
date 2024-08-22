//package mvc.controller;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class HelloController {
//	@RequestMapping("/hello") //nơi chua duong dan
//	public String greeting(@RequestParam(name = "person") String person,
//						   @RequestParam(name = "country", required = false, defaultValue = "Viet Nam") String country,
//						   Model model) {
//		model.addAttribute("personName", person);
//		model.addAttribute("country", country);
//
//		return "helloWorld/greeting"; // di den noi co chua index.jsp
//	}
//	@RequestMapping("/hello/{person}/{country}")
//	public String greeting2 (@PathVariable("person") String person,
//							 @PathVariable ("country") String country,
//							Model model) {
//		model.addAttribute("personName", person);
//		model.addAttribute("country", country);
//			return "helloWorld/greeting";
//	}
//
//}
