/**
 * 
 */

/**
 * @author Sukhvir
 *
 */
import java.sql.*;

public class DatabasesDriver {


	static String storEID;
	public static String getStorEID() {
		return storEID;
	}
	public static void setStorEID(String sEID) {
		storEID = sEID;
	}
	public static Connection connect() {
		// TODO Auto-generated method stub
		
		String user = "root";
		String pass = "Admin";
		
		try{
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cs580_ASE", user, pass);
			System.out.println("Databse Connection: Connect");
			return connection;
						}
		
		catch(Exception e){
			System.out.println("Databse Connection: FAILED");
			e.printStackTrace();
			return null;
		}
				
		}}