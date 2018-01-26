import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 */

/**
 * @author Sukhvir
 *
 */
public class EmpLogin {
	
    Connection con;
    static String EID;
	
	public	EmpLogin(String user, String pass){
		DatabasesDriver db = new DatabasesDriver();
	
		try {
			con= DatabasesDriver.connect();
			EID =user;
			// Pass = textField_Pass.getText();
			db.setStorEID(EID);
			String qurry ="select emp_Id, emp_Pass from employee_Info where emp_Id = ?";
			PreparedStatement pst = con.prepareStatement(qurry);
			pst.setString(1, EID);
			ResultSet rs =pst.executeQuery();
			while(rs.next()){
			if(pass.equals(rs.getString("emp_Pass"))){
				
			System.out.println("Login: Success");
	}}}
			
			
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				System.out.println("Login Fail");
			} 
			
		}}

