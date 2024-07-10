package com.ex.model;

import javax.sql.DataSource;
import java.util.*;

public interface UserDao {
	public void setDataSource(DataSource ds); 
	
	   public void createUserReg(String name, String email, int age);  
	   
	   public UserReg getUserReg(Integer id);      
	   public List<UserReg> listUserReg();      
	   public void deleteUserReg(Integer id);      
	   public void updateUserReg(Integer id, String email);
}