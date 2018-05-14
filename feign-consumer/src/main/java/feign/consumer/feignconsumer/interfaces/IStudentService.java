package feign.consumer.feignconsumer.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("STUDENT-SERVICE")
public interface IStudentService {
	
	@RequestMapping(value = "/getStudentDetailsForSchool/abcschool")
	List<Object> getStudents();
}
