
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
		System.out.println("Login as: Sukh, pass: Singh ");
		System.out.print("User Name:");
		//usr = new Scanner(System.in);
		//String user=usr.nextLine();
		System.out.print("User Pass:");
		//pas = new Scanner(System.in);
		//String pass=pas.nextLine();
		@SuppressWarnings("unused")
		//EmpLogin emplog = new EmpLogin(user, pass);
		DatabasesDriver db = new DatabasesDriver();
		DatabasesDriver.connect();
	}

}
