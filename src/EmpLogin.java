/**
 * 
 */

/**
 * @author Sukhvir
 *
 */
public class EmpLogin {
	String UserName;
	String UserPass;

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPass() {
		return UserPass;
	}

	public void setUserPass(String userPass) {
		UserPass = userPass;
	}

	EmpLogin(String user, String pass) {
		if (user.equals("Sukh")) {
			if (pass.equals("Singh")) {
				System.out.println("You are Logged  in Successfully");
			}
		}
		else{
		System.out.println("Login Failed");
		}

	}
}
