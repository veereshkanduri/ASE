
import java.util.Scanner;

/**
 * @author Sukhvir
 *
 */
public class MeetingOrg {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner usr;
		Scanner pas;
		System.out.println("Login as: Sukh, pass: ss ");
		System.out.print("Employee ID:");
		usr = new Scanner(System.in);
		String user=usr.nextLine();
		System.out.print("Emp Pass:");
		pas = new Scanner(System.in);
		String pass=pas.nextLine();
		
		DatabasesDriver db = new DatabasesDriver();
		EmpLogin emplog = new EmpLogin(user, pass);
		Employee emp = new Employee("Kulvir","Virk","IT","CEO");
	}

}
