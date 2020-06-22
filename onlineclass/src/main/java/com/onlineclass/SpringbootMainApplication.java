package com.onlineclass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 
 * @author hwy
 * @since 2019/10/21
 * @version 0.01
 *
 */

//扫描需要启动springboot的包
@SpringBootApplication(scanBasePackages = "com.onlineclass.*")
//配置启动的Mapper接口
@MapperScan(value = "com.onlineclass.dao")

public class SpringbootMainApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMainApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootMainApplication.class);
	}

}
