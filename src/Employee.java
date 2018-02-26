import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

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
int eID;
Scanner sc;
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

public int geteID() {
	return eID;
}
public void seteID(int eID) {
	this.eID = eID;
}
public void getEmpInfo()
{
	System.out.println("Enter Employee information:");
	System.out.print("Employee: First name:");
	sc= new Scanner(System.in);
	fName=sc.nextLine();
	System.out.print("Employee: Last name:");
	sc= new Scanner(System.in);
	lName=sc.nextLine();
	System.out.print("Employee: Department :");
	sc= new Scanner(System.in);
	department=sc.nextLine();
	System.out.print("Employee: Position:");
	sc= new Scanner(System.in);
	position=sc.nextLine();
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

public Employee() {
	// TODO Auto-generated constructor stub
}
public void getEmpId(){
	System.out.println("Enter Employee ID you want to delete:");
	System.out.print("Employee ID:");
	sc= new Scanner(System.in);
	eID=sc.nextInt();
}
public void deleteEmployee(int Id)
{
	
String query = "delete from  employee_Info where emp_Id="+Id;
	
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
	
}
