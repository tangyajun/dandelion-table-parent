package com.dandelion.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandelion.domain.Student;
import com.dandelion.mapper.StudentMapper;
import com.dandelion.service.StudentService;

/**
 *  <p>Title: StudentServiceImpl </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2018年4月8日下午12:25:05
 *  @version 1.0
 */

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentMapper studentMapper;
	/**
	 * 
	 */
	@Override
	public int add(Student e) throws Exception {
		return 0;
	}

	/**
	 * 
	 */
	@Override
	public int delete(Long pk) throws Exception {
		return 0;
	}

	/**
	 * 
	 */
	@Override
	public int modify(Student e) throws Exception {
		return 0;
	}

	/**
	 * 
	 */
	@Override
	public Student get(Long pk) {
		Student stu=new Student();
		stu.setAge(12);
		stu.setCreateTime(new Date());
		stu.setHomeAddress("北京市朝阳区");
		stu.setMobilePhone("13693669002");
		stu.setRealName("唐亚军");
		stu.setUserName("aaron");
		stu.setUserPassword("123456");
		return studentMapper.selectByPrimaryKey(pk);
//		return stu;
	}

	/**
	 * 
	 */
	@Override
	public List<Student> getAll() {
		return null;
	}

	/**
	 * 
	 */
	@Override
	public List<Student> find(Student e) {
		return null;
	}

	/**
	 * 
	 */
	@Override
	public Map<String, Object> findByEntity(Student e) {
		return null;
	}

}

