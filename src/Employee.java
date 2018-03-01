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
public class Employee {
	String fName;
	String lName;
	String department;
	String position;
	String ePass;
	int eID;
	String nPass;
	static String EID;
	Scanner sc;
	DatabasesDriver db = new DatabasesDriver();
	java.sql.Connection conn = db.connect();

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

	public String getePass() {
		return ePass;
	}

	public void setePass(String ePass) {
		this.ePass = ePass;
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public String getnPass() {
		return nPass;
	}

	public void getEmpInfo() {
		System.out.println("Enter Employee information:");
		System.out.print("Employee: First name:");
		sc = new Scanner(System.in);
		fName = sc.nextLine();
		System.out.print("Employee: Last name:");
		sc = new Scanner(System.in);
		lName = sc.nextLine();
		System.out.print("Employee: Department :");
		sc = new Scanner(System.in);
		department = sc.nextLine();
		System.out.print("Employee: Position:");
		sc = new Scanner(System.in);
		position = sc.nextLine();
		System.out.print("Employee: Pass:");
		sc = new Scanner(System.in);
		ePass = sc.nextLine();
	}

	Employee(String fname, String lname, String dept, String pos, String pass) {
		// TODO Auto-generated method stub
		String query = "insert into employee_info(emp_F_Name, emp_L_Name, emp_Dept,emp_Pos,emp_Pass) values ('" + fname
				+ "','" + lname + "','" + dept + "','" + pos + "','" + pass + "')";

		java.sql.Statement st = null;
		try {
			st = conn.createStatement();
			st.execute(query);
			// st.executeQuery(query);
			System.out.println("Employee Created");

		} catch (Exception e) {
			System.out.println("Fail to Save employee information");
		}

		finally {
			try {
				// st.close();
				// conn.close();
			} catch (Exception e) {
				System.out.println("Fail to close connections");
			}
		}

	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void getEmpId() {
		System.out.println("Enter Employee ID you want to delete:");
		System.out.print("Employee ID:");
		sc = new Scanner(System.in);
		eID = sc.nextInt();

	}

	public void deleteEmployee(int Id) {

		String query = "delete from  employee_Info where emp_Id=" + Id;

		java.sql.Statement st = null;
		try {
			st = conn.createStatement();
			st.execute(query);
			// st.executeQuery(query);
			System.out.println("Query Generated");

		} catch (Exception e) {
			System.out.println("Fail to Save employee information");
		}

		finally {
			try {
				// st.close();
				// conn.close();
			} catch (Exception e) {
				System.out.println("Fail to close connections");
			}
		}

	}

	public void getChangePassInfo() {
		System.out.print("Employee ID:");
		sc = new Scanner(System.in);
		eID = sc.nextInt();
		System.out.print("Employee:  Old Pass:");
		sc = new Scanner(System.in);
		ePass = sc.nextLine();
		System.out.print("Employee:  New Pass:");
		sc = new Scanner(System.in);
		nPass = sc.nextLine();
	}

	public void changePass(String user, String pass, String nPass) {

		try {

			EID = user;
			db.setStorEID(EID);
			String qurry = "select emp_Id, emp_Pass from employee_Info where emp_Id = ?";
			PreparedStatement pst = conn.prepareStatement(qurry);
			pst.setString(1, EID);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				if (pass.equals(rs.getString("emp_Pass"))) {
					qurry = " update employee_info set emp_Pass ='" + nPass + "' Where emp_Id =" + user;
					// pst = conn.prepareStatement(qurry);
					java.sql.Statement st = null;
					st = conn.createStatement();
					st.execute(qurry);
					System.out.println("Password Changed");
				}
			}
		}

		catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("Password Change: FAIL");
		}

	}
	public void employeeInfoUpdate(String user){
		try {

			EID = user;
			db.setStorEID(EID);
			String qurry = "select emp_F_Name, emp_L_Name, emp_Dept,emp_Pos from employee_Info where emp_Id = ?";
			PreparedStatement pst = conn.prepareStatement(qurry);
			pst.setString(1, EID);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				//rs.getString("emp_F_Name");
				System.out.println("First name:"+ rs.getString("emp_F_Name") + "\tLast name:"+ rs.getString("emp_L_Name")+ "\tDepartment:"+ rs.getString("emp_Dept")+ "\tPosition:"+ rs.getString("emp_Pos"));				
				}
			
		}

		catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("Password Change: FAIL");
		}	
		
		
	}

}
