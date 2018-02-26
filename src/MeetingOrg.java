
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

		System.out.println("Enter your choices:" + "\nAdd Employee: A  \t\tEdit Employee: E \t\t Delete Employee: D"
				+ "\nAdd Room: R  \t\t\tEdit Room: I \t\t\t Delete Room: N"
				+ "\nNew Meeting: M  \t\tupdate Meeting: U \t\t Delete Meeting: W");

		Opt = new Scanner(System.in);
		String Option = Opt.nextLine().toUpperCase();
		switch (Option) {
		case "A": {
			/*String f_name, l_name, department, position;
			Scanner sc;
			System.out.println("Enter Employee information:");
			System.out.print("Employee: First name:");
			sc= new Scanner(System.in);
			f_name=sc.nextLine();
			System.out.print("Employee: Last name:");
			sc= new Scanner(System.in);
			l_name=sc.nextLine();
			System.out.print("Employee: Department :");
			sc= new Scanner(System.in);
			department=sc.nextLine();
			System.out.print("Employee: Position:");
			sc= new Scanner(System.in);
			position=sc.nextLine();*/
			Employee em = new Employee();
			em.getEmpInfo();
			Employee emp = new Employee( em.getfName(), em.getlName(),em.getDepartment(), em.getPosition());
			
			break;
		}
		case "E": 
			System.out.println(Option);
			break;
		

		case "D": {
			System.out.println(Option);
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
