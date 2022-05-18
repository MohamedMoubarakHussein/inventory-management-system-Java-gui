package controller;

public class DatabaseConnection {
	DatabaseOperation database= new DatabaseOperation(new SqliteDatabase());
	 protected String sql;  
}
