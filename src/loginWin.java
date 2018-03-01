import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginWin {

	private JFrame frmMeetingOrganizer;
	private JTextField textField_EID;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginWin window = new loginWin();
					window.frmMeetingOrganizer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public loginWin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMeetingOrganizer = new JFrame();
		frmMeetingOrganizer.setForeground(SystemColor.activeCaption);
		frmMeetingOrganizer.setResizable(false);
		frmMeetingOrganizer.setIconImage(Toolkit.getDefaultToolkit().getImage(loginWin.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		frmMeetingOrganizer.setTitle("Meeting Organizer - Login");
		frmMeetingOrganizer.getContentPane().setForeground(SystemColor.activeCaption);
		frmMeetingOrganizer.setBounds(100, 100, 509, 300);
		frmMeetingOrganizer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMeetingOrganizer.getContentPane().setLayout(null);
		
		textField_EID = new JTextField();
		textField_EID.setBounds(214, 63, 146, 26);
		frmMeetingOrganizer.getContentPane().add(textField_EID);
		textField_EID.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(214, 105, 146, 26);
		frmMeetingOrganizer.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//EmpLogin emplog = new EmpLogin(textField_EID.getText(), passwordField.getText());
				EmpLogin emplog = new EmpLogin();
				if (emplog.EmployeeLogin(textField_EID.getText(), passwordField.getText())==true){
					System.out.println("Login Pass");
					MeetingOrganizer Mo= new MeetingOrganizer();
					System.out.println(" you should see  meeting window");
				}
			}
		});
		btnLogin.setBounds(134, 172, 115, 29);
		frmMeetingOrganizer.getContentPane().add(btnLogin);
		
		JButton btnCancle = new JButton("Cancle");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnCancle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(1);		
			}
		});
		btnCancle.setBounds(275, 172, 115, 29);
		frmMeetingOrganizer.getContentPane().add(btnCancle);
		
		JLabel lblEid = new JLabel("EID");
		lblEid.setBounds(162, 66, 37, 20);
		frmMeetingOrganizer.getContentPane().add(lblEid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(122, 108, 77, 20);
		frmMeetingOrganizer.getContentPane().add(lblPassword);
	}

}
