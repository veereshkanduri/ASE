
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
		Scanner Opt;
		System.out.println("Login as: Sukh, pass: ss ");
		System.out.print("Employee ID:");
		usr = new Scanner(System.in);
		String user = usr.nextLine();
		System.out.print("Emp Pass:");
		pas = new Scanner(System.in);
		String pass = pas.nextLine();
		DatabasesDriver db = new DatabasesDriver();
		EmpLogin emplog = new EmpLogin(user, pass);
		Employee em = new Employee();
		System.out.println("Enter your choices:" + "\nAdd Employee: A  \t\tEdit Employee: E \t\t Delete Employee: D \t\t Change Pass: C"
				+ "\nAdd Room: R  \t\t\tEdit Room: I \t\t\t Delete Room: N"
				+ "\nNew Meeting: M  \t\tupdate Meeting: U \t\t Delete Meeting: W");

		Opt = new Scanner(System.in);
		String Option = Opt.nextLine().toUpperCase();
		switch (Option) {
		case "A": {
			
			em.getEmpInfo();
			Employee emp = new Employee( em.getfName(), em.getlName(),em.getDepartment(), em.getPosition(), em.getePass());
			
			break;
		}
		case "E": 
			System.out.println(Option);
			break;
		case "C": {
			em.getChangePassInfo();
			em.changePass(Integer.toString(em.geteID())  , em.getePass(), em.getnPass());
						break;
		}

		case "D": {
			em.getEmpId();
			em.deleteEmployee(em.geteID() );
			break;
		}
		case "R": {
			System.out.println(Option);
			break;
		}
		case "I": {
			System.out.println(Option);
			break;
		}
		case "N": {
			System.out.println(Option);
			break;
			
		}
		case "M": {
			System.out.println(Option);
			break;
		}
		case "U": {
			System.out.println(Option);
			break;
		}
		case "W": {
			System.out.println(Option);
			break;
		}
		default: {
			System.out.println("Invalid Choice");
		}
		}

	}

	
	// emp.deleteEmployee(4);
}
