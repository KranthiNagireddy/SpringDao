package com.ex.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<UserReg> 
{
   public UserReg mapRow(ResultSet rs, int rowNum) throws SQLException {
      
     int uid   = rs.getInt("uid");
     String na = rs.getString("name");
	 String em = rs.getString("email");
     int    ag = rs.getInt("age");
     
	 UserReg user = new UserReg( uid, na, em, ag);
      
     return user;
   }
}