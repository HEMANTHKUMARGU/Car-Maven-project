package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LamborghiniAutomatic extends LamborginiAbstractClass {
	
	private Statement stmt;
	@Override
	public void charr(String carname) {
		try
		{
			Connection con=DbConnection.getConnection();
			stmt=con.createStatement();
			String query=Querys.getQuerry("queryla", carname);
			ResultSet result = stmt.executeQuery(query);
			while(result.next())
			{
				System.out.println(result.getString("automatic"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
 	}
	@Override
	public void engine(String carname) {
		System.out.println("ENGINE DETAILS:\r\n" + "Lamborghini engine \"Fecher\" likely refers to the\r\n "
				+ "Lamborghini Huracán's naturally aspirated 5.2-liter V10 engine,\r\n "
				+ "known for its powerful performance and distinctive sound.");
	}

}
