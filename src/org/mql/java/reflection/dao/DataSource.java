package org.mql.java.reflection.dao;

import java.sql.Connection;

public interface DataSource {
	public Connection getConnection();
}
