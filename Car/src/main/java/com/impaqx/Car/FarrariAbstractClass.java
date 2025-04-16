package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class FarrariAbstractClass implements Icar {
	private Statement stmt;
	private ResultSet result;
	private Statement stmte;

	@Override
	public void charr(String carname) {
		try {
			Connection con = DbConnection.getConnection();
			stmt = con.createStatement();
			String query = Querys.getQuerry("queryfc", carname);
			result = stmt.executeQuery(query);
			while (result.next()) {
				System.out.println(result.getString("charecter"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void engine(String carname) {
		try
		{
			Connection con=DbConnection.getConnection();
			stmte=con.createStatement();
		    String query=Querys.getQuerry("queryfe", carname);
		    ResultSet resulte = stmte.executeQuery(query);
		    while(resulte.next())
		    {
		    	System.out.println(resulte.getString("engine"));
		    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
