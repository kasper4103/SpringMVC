/*
*
*Copyright (c) 2020, pcschool 
*/

package tw.com.pcschool.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import tw.com.pcschool.entity.User;

/**
*
*@author Lee
* 課程大綱:
*/


@Controller
@RequestMapping("/springmvc")
public class SpringMCVCTest {
	private static final String SUCCESS ="success";
	
	@RequestMapping("/testServletAPI")
	public String testServlerAPI(HttpServletRequest request,HttpServletResponse response) {
		System.out.println(request+"=="+response);
		return SUCCESS;
	}
	
	
	@RequestMapping("/testPOJO")
	public String testPOJO(User user) {
		System.out.println(user);
		return SUCCESS;
	}
	
	
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID")String sessionID) {
		System.out.println("JSESSIONID:"+sessionID);
		return SUCCESS;
	}
	
	@RequestMapping("/headle5")
	public String headle5(@RequestHeader(value="Accept-Language") String al,
			@RequestHeader(value="User-Agent") String ua) {
		System.out.println("Accept-Language:"+al);
		System.out.println("User-Agent:"+ua);
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testRequestParam")
	public String testRequestParam(@RequestParam (value="username") String name
			,@RequestParam (value="age") Integer age) {
		System.out.println(name+":"+age);
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.POST)
	public String testRestPost() {
		System.out.println("test POST:");
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.GET)
	public String testRestGet(@PathVariable("id")Integer id) {
		System.out.println("test GET:"+id);
		return SUCCESS;
	}
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.PUT)
	public String testRestPut(@PathVariable("id")Integer id) {
		System.out.println("test PUT:"+id);
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testRest/{id}",method=RequestMethod.DELETE)
	public String testRestDelete(@PathVariable("id")Integer id) {
		System.out.println("test DELETE:"+id);
		return SUCCESS;
	}
	
	
	@RequestMapping(value="/testPathVariable/{id}")
	public String testPathVariable(@PathVariable("id")Integer id) {
		System.out.println("testPathVariable");
		return SUCCESS;
	}

	/*
	 * ant
	 * ?
	 * *
	 * **
	 */

	@RequestMapping(value="/testAntPath/*/abc")
	public String testAntPath() {
		System.out.println("testAntPath");
		return SUCCESS;
	}
	
	
	
	/*
	 * @return
	 */
	@RequestMapping(value="/testParamsAndHeaders" 
			,params= {"username","age!=10"})
	public String testParamsAndHeaders() {
		System.out.println("testParamsAndHeaders");
		return SUCCESS;
	}
	
	
	
	@RequestMapping(value="/testMethod" , method=RequestMethod.POST)
	public String testMethod() {
		System.out.println("testMethod");
		return SUCCESS;
	}
	
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping() {
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
}
