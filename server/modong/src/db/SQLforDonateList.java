/*
 * SQLforDonationList.java
 * 
 * it defines sql stmt for list of Donation between organization and user
*/

package db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLforDonateList {
	private Statement stmt; // statement
	
	private Statement getStatement(Connection conn)
	{
		stmt = null;
		try {
			stmt = conn.createStatement();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("create Stmt Error");
			e.printStackTrace();
		} finally {
			return stmt; // return stmt
		}
	}
}
