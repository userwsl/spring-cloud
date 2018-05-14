package feign.consumer.feignconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import feign.consumer.feignconsumer.interfaces.IStudentService;

@RestController
public class TestController {

	@Autowired
	private IStudentService iStudentService;
	
	@RequestMapping(value = "/test")
	public String student() {
		return iStudentService.getStudents().toString();
	}
}
