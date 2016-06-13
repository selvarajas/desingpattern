package com.javaguys.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.springframework.stereotype.Repository;
import com.blog.javaguys.user.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	
	public User getUserDetails(String userId) {
		
		User user = new User();
		String connectionURL = "jdbc:mysql://localhost:3306/integration";
		
		Connection con = null;
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection (connectionURL,"root","root");
		    Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("select * from user where id="+userId);
		 
		    while (rs.next()){
		        user.setUserId(rs.getString("id"));
		        user.setUserGender(rs.getString("gender"));
		        user.setUserName(rs.getString("name"));
		        user.setUserStatus(rs.getString("status"));
		}
		}
		catch (SQLException e) {
		    e.printStackTrace();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
		    try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}

	public String saveUserDetails(User user) {
		String connectionURL = "jdbc:mysql://localhost:3306/integration";
		
		Connection con = null;
		try {
		    Class.forName("com.mysql.jdbc.Driver");
		    con = DriverManager.getConnection (connectionURL,"root","root");
		    Statement stmt = con.createStatement();
		    int i = stmt.executeUpdate("insert into user values ('"+user.getUserId()+"','"+user.getUserName()+"','"+user.getUserGender()+"','"+user.getUserStatus()+"')");
		    System.out.println("Succeded !");
		}
		catch (SQLException e) {
		    e.printStackTrace();
		}
		catch (Exception e) {
		    e.printStackTrace();
		}
		finally {
		    try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return user.getUserId();
	}

	
	
	
}
