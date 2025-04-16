package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LamborghiniBaseCar extends LamborginiAbstractClass {
	private Statement stmt;
	private ResultSet result;

	public void baseVerent(String carname) {
		try
		{
			Connection con=DbConnection.getConnection();
			stmt=con.createStatement();
			String query=Querys.getQuerry("querylb",carname);
			result=stmt.executeQuery(query);
			while(result.next())
			{
				String ans=result.getString("baseverent");
				System.out.println(ans);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
