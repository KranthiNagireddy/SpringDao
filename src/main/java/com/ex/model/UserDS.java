package com.ex.model;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserDS implements UserDao
{
	
	DataSource  		 dataSource ; 
	private JdbcTemplate jdbcTemp;
	
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource     = ds; 
		jdbcTemp	 		= new JdbcTemplate(this.dataSource);
	}

	@Override
	public void createUserReg(String name, String email, int age) 
	{
		String Q = "insert into UserReg (name, email, age) values(?,?,?) ";
		jdbcTemp.update(Q, name, email, age);
		System.out.println("New record Inserted with name #" + name);
		//return ;
	}
	
	
	@Override
	public UserReg getUserReg(Integer id) {
		String Q = "Select * from UserReg where uid= ?";
		UserReg U = jdbcTemp.queryForObject(Q, new Object[]{id}, new  UserMapper());		
		return U;
	}
	@Override
	public List<UserReg> listUserReg() {
		String Q1 = "Select * from UserReg";
		List<UserReg> Users = jdbcTemp.query(Q1, new UserMapper());
		for(UserReg U : Users)
		{
			System.out.println(U);
		}		
		return null;
	}
	@Override
	public void deleteUserReg(Integer id) {
		String SQL = "delete from UserReg where uid = ?";
		jdbcTemp.update(SQL, id);
		System.out.println("The Record of User Reg with ID " + id + " Deleted");
	}
	@Override
	public void updateUserReg(Integer id, String email) {
		String SQL = "update UserReg set email = ? where uid = ?";
		jdbcTemp.update(SQL, email, id);
		System.out.println("Email of User Reg with ID " + id + " has updated  ");		
	}
}