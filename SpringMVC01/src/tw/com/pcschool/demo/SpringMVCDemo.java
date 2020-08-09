/*
*
*Copyright (c) 2020, pcschool 
*/

package tw.com.pcschool.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
*
*@author Lee
* 課程大綱:
*/
@RequestMapping("/springmvc")
@Controller
public class SpringMVCDemo {
	private static final String SUCCESS ="success";
	
	
	@RequestMapping("/helloworld")
	public String SpringMVCDemo() {
		System.out.println("Spring mvc haha");
		return SUCCESS;
	}
}
