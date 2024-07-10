package com.ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ex.model.UserDS;
import com.ex.model.UserReg;

@SpringBootApplication
public class JdbcDemo2Application {

	public static void main(String[] args) { 
		
		SpringApplication.run(JdbcDemo2Application.class, args);	
		
		ApplicationContext Ctx = new ClassPathXmlApplicationContext("dbconfig.xml");
		UserDS    useroperation= (UserDS) Ctx.getBean("dataSource1" );
		useroperation.createUserReg("Adil", "Aadil@gmail.com", 19);
		useroperation.createUserReg("Moh",  "Vmoh@gmail.com", 20);
		useroperation.createUserReg("Faraz", "CFaraz@gmail.com", 21);
	useroperation.createUserReg("Rahim", "Drahim@gmail.com", 22);
		// To Search the UserReg
		UserReg user = useroperation.getUserReg(104);
		System.out.println("user with ID = 104");
		System.out.println(user);
		
		useroperation.deleteUserReg(102);
		
		useroperation.updateUserReg(101, "AAdilmoh@gmail.com" );
		
		System.out.println("All User Registeration Details");
		useroperation.listUserReg();
		
	}

}