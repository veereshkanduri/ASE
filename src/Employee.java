import com.mysql.jdbc.Statement;
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
public class Employee{
String fName;
String lName;
String department;
String position;
DatabasesDriver db = new DatabasesDriver();
java.sql.Connection conn= db.connect();
public String getfName() {
	return fName;
}
public void setfName(String fName) {
	this.fName = fName;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}

Employee(String fname, String lname, String dept, String pos) {
	// TODO Auto-generated method stub
	String query = "insert into employee_info(emp_F_Name, emp_L_Name, emp_Dept,emp_Pos ) values ('"+fname+"','"+lname+"','"+dept+"','"+pos+"')";
	
	java.sql.Statement st=null;
try{
	st= conn.createStatement();
	st.execute(query);
	//st.executeQuery(query);
	System.out.println("Query Generated");
		
}
catch(Exception e){
	System.out.println("Fail to Save employee information");
		}

finally {
	try {
	//st.close();
	//conn.close();	
}
catch(Exception e){
	System.out.println("Fail to close connections");
}}

	
}

public void deleteEmployee(int Id)
{
	
}
	
}
