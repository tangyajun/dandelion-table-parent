package com.dandelion.web.resource;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dandelion.domain.Student;
import com.dandelion.service.StudentService;

/**
 *  <p>Title: TestController </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2018年3月28日下午5:19:05
 *  @version 1.0
 */

@RestController
@RequestMapping(value="/test")
public class TestController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping(method=RequestMethod.GET)
	public Student testMethod() {
		Map<String,Object> map=new HashMap<>();
		map.put("admin", "123456");
		Student stu=studentService.get(new Long(8));
		System.out.println("=============================");
		return stu;
	}
}

