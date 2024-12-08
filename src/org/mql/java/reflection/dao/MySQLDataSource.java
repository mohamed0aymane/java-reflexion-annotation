package org.mql.java.reflection.dao;

import java.sql.Connection;

public class MySQLDataSource  implements DataSource{

	public MySQLDataSource() {
		System.out.println("new MySQLDataSource");
		}

	@Override
	public Connection getConnection() {
		System.out.println("MySQLDataSource.getConnection()");
		return null;
		
	}

}
