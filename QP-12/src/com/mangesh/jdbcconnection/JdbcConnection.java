package com.mangesh.jdbcconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public abstract class JdbcConnection {

	public static Connection getJdbcConnection() throws SQLException, IOException {

	
		HikariConfig config = new HikariConfig("src\\com\\mangesh\\properties\\application.properties");
		HikariDataSource dataSource = new HikariDataSource(config);
		
		String jdbcUrl = dataSource.getJdbcUrl();
		String username = dataSource.getUsername();
		String password = dataSource.getPassword();
		
		System.out.println(jdbcUrl);
		System.out.println(username);
		System.out.println(password);
		
		return  dataSource.getConnection();
		
		}
		
//		Connection connection = null;
//		
//		FileInputStream fStream = new FileInputStream(new File("src\\com\\mangesh\\properties\\application.properties"));
//		
//		Properties properties = new Properties();
//		properties.load(fStream);
//		
//		
//		connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user")
//				   ,properties.getProperty("password"));
//	
//		return connection;

	}
