package com.hello;


import com.dao.DeptDao;
import com.entity.DeptEntity;
import com.service.DeptService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lzb
 * 	SpringBootApplication:声明该类是一个springbootApplication类(配置类)
 *  ComponentScan:扫描当前包下的注解,进行spring管理
 *  MapperScan:扫描当前包下的Mapper,目的是获得dao的实现类
 */
@SpringBootApplication
@RestController
@MapperScan("com.dao")
@ComponentScan("com.service")
public class BootHelloApplication {
	@Autowired
	private DeptService deptService;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootHelloApplication.class,args);
	}
	@RequestMapping("/index")
	public String index(){
		List<DeptEntity> list = deptService.listDepts(1,2);
		for (DeptEntity deptEntity : list) {
			System.out.println("deptEntity = " + deptEntity);
		}
		return "hello word";
	}
}
