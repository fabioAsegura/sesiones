/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author LabingXEON
 */

    
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Dbutil {
	private static Connection CONEXION=null;
	public static Connection getConnection() throws SQLException{
		   if(CONEXION == null){
			   try {
			     Class.forName("com.mysql.jdbc.Driver").newInstance();
                             //Integracion Log4J
			   } catch (ClassNotFoundException e) {
				throw new SQLException(e);
			   } catch (InstantiationException e) {
                               //Integracion Log4J
				   	throw new SQLException(e);
			   } catch (IllegalAccessException e) {
                               //Integracion Log4J
				   	throw new SQLException(e);
			   }

			  try {
			    CONEXION = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo","root", "root");
     			  } catch (SQLException e) {
			     throw new SQLException(e);
			  }

				
		   }
		   return CONEXION;
	}
	
	public static void closeConnection()  throws SQLException{
		 try {
			 if(CONEXION!=null){
				 CONEXION.close();
				 CONEXION=null;
			 }
			 
			} catch (SQLException e) {
				//Integracion Log4J
				throw new SQLException(e);
			}
		    
	}
	

}
