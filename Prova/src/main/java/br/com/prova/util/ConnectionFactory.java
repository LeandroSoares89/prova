package br.com.prova.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class ConnectionFactory {
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/bd_equipamento";
	private static final String USER = "postgres";
	private static final String PASSWORD = "123456";
	  
	  public Connection openConnection(){
		  try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL,USER, PASSWORD);
		} catch (Exception e) {
			System.err.println("Erro ao abrir conexão!");
			e.printStackTrace();
		}
		return null;
		  
	  }
	  public void closeConnection(Connection c, Statement s, ResultSet r ){
		  
		try {
			if(r != null) r.close();
			if(s != null) s.close();
			if(c != null)c.close();
			
		} catch (Exception e) {
			System.err.println("Erro ao fechar conexão!");
			e.printStackTrace();
		}
		
	  }
	  
}
