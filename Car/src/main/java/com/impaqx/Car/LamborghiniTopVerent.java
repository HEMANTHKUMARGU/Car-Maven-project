package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LamborghiniTopVerent extends LamborginiAbstractClass {
	private Statement stmt;
	private ResultSet r;

	public void topVerent(String carname) {
		try
		{
			Connection con=DbConnection.getConnection();
			stmt=con.createStatement();
			String qurry=Querys.getQuerry("querylt",carname);
			r=stmt.executeQuery(qurry);
			while(r.next())
			{
				String res=r.getString("topverent");
				System.out.println(res);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
