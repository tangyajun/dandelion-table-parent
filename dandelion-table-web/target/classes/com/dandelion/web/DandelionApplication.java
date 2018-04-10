package com.dandelion.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *  <p>Title: DandelionApplication </p>
 *  <p>Description: </p>
 *  <p>Company: www.fengmap.com </p> 
 *	@author aaron
 *  @date 2018年3月28日下午5:15:13
 *  @version 1.0
 */
@SpringBootApplication
@ComponentScan("com.dandelion")
@MapperScan("com.dandelion.mapper")
public class DandelionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DandelionApplication.class, args);
	}
}

