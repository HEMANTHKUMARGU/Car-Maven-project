package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FarrariTopVerent extends FarrariAbstractClass {
	private Statement stmt;

	public void topEndFetures(String carname) {
		try
		{
			Connection con=DbConnection.getConnection();
			 stmt =con.createStatement();
			String query=Querys.getQuerry("queryft", carname);
			ResultSet result = stmt.executeQuery(query);
			while(result.next())
			{
				System.out.println(result.getString("topverent"));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
