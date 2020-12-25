package com.zzg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.zzg.mapper")
public class CRMApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(CRMApplication.class, args);
		System.out.println("============= SpringBoot CRM Project Start Success =============");
	}

}
