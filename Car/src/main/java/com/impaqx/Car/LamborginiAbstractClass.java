package com.impaqx.Car;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public abstract class LamborginiAbstractClass implements Icar {
	private Statement stmt;
	private Statement stmte;
	private ResultSet resulte;

	@Override
	public void charr(String carname) {
		Connection conn = DbConnection.getConnection();
		try {
			stmt = conn.createStatement();
			String query = Querys.getQuerry("querylc", carname);
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				String charr = result.getString("charecter");
				System.out.println(charr);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void engine(String carname) {
		Connection con = DbConnection.getConnection();
		try {
			stmte = con.createStatement();
			String query = Querys.getQuerry("queryle", carname);
			resulte = stmte.executeQuery(query);
			while (resulte.next()) {
				String r = resulte.getString("engine");
				System.out.println(r);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
