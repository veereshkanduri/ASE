import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MeetingOrganizer {

	JFrame frmMain;
	JInternalFrame internalFrame_login;
	private JTextField textField_EID;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginWin lW = new loginWin();
					
					MeetingOrganizer window = new MeetingOrganizer();
					window.frmMain.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MeetingOrganizer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frmMain = new JFrame();
		frmMain.setIconImage(Toolkit.getDefaultToolkit().getImage(MeetingOrganizer.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		frmMain.setTitle("Meeting Organizer");
		frmMain.setBounds(100, 100, 1555, 876);
		frmMain.setSize(screenSize.width ,screenSize.height);
		frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMain.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setVisible(false);
		menuBar.setBackground(SystemColor.inactiveCaption);
		menuBar.setBounds(0, 0, 1533, 31);
		menuBar.setSize(screenSize.width, 30);
		frmMain.getContentPane().add(menuBar);
		
		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				internalFrame_login.setVisible(true);			}
		});
		mnEmployee.add(mntmLogin);
		
		JMenuItem mntmAddEmployee = new JMenuItem("Add Employee");
		mnEmployee.add(mntmAddEmployee);
		
		JMenuItem mntmUpdateEmployee = new JMenuItem("Update Employee ");
		mnEmployee.add(mntmUpdateEmployee);
		
		JMenuItem mntmChangePassword = new JMenuItem("Change Password");
		mnEmployee.add(mntmChangePassword);
		
		JSeparator separator = new JSeparator();
		mnEmployee.add(separator);
		
		JMenuItem mntmDeleteEmployee = new JMenuItem("Delete Employee");
		mnEmployee.add(mntmDeleteEmployee);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnEmployee.add(mntmExit);
		
		JMenu mnMeeting = new JMenu("Meeting");
		menuBar.add(mnMeeting);
		
		JMenuItem mntmCreateMeeting = new JMenuItem("Create Meeting");
		mnMeeting.add(mntmCreateMeeting);
		
		JMenuItem mntmUpdateMeeting = new JMenuItem("Update Meeting");
		mnMeeting.add(mntmUpdateMeeting);
		
		JMenuItem mntmCancleMeeting = new JMenuItem("Cancle Meeting");
		mnMeeting.add(mntmCancleMeeting);
		
		JMenuItem mntmInviteEmployees = new JMenuItem("Invite Employees");
		mnMeeting.add(mntmInviteEmployees);
		
		JMenu mnRoom = new JMenu("Room");
		menuBar.add(mnRoom);
		
		JMenuItem mntmAddRoom = new JMenuItem("Add Room");
		mnRoom.add(mntmAddRoom);
		
		JMenuItem mntmEditCapacity = new JMenuItem("Edit Capacity");
		mnRoom.add(mntmEditCapacity);
		
		JMenuItem mntmDeleteRoom = new JMenuItem("Delete Room");
		mnRoom.add(mntmDeleteRoom);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelpTopics = new JMenuItem("Help Topics");
		mnHelp.add(mntmHelpTopics);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		
		internalFrame_login = new JInternalFrame("Meeting Organizer Login");
		internalFrame_login.setFrameIcon(null);
		//internalFrame_login.setIcon(true);
		internalFrame_login.setBounds(453, 156, 657, 334);
		frmMain.getContentPane().add(internalFrame_login);
		internalFrame_login.getContentPane().setLayout(null);
		
		JLabel lblEid = new JLabel("EID");
		lblEid.setBounds(204, 75, 31, 20);
		internalFrame_login.getContentPane().add(lblEid);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(166, 121, 69, 20);
		internalFrame_login.getContentPane().add(lblPassword);
		
		textField_EID = new JTextField();
		textField_EID.setBounds(254, 72, 146, 26);
		internalFrame_login.getContentPane().add(textField_EID);
		textField_EID.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(254, 118, 146, 26);
		internalFrame_login.getContentPane().add(passwordField);
		
		JButton btn_Login = new JButton("Login");
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmpLogin emplog = new EmpLogin();
				if (emplog.EmployeeLogin(textField_EID.getText(), passwordField.getText())==true){
					internalFrame_login.setVisible(false);
					menuBar.setVisible(true);
					System.out.println("Login Pass");
				}
			}
		}); 
		btn_Login.setBounds(166, 206, 115, 29);
		internalFrame_login.getContentPane().add(btn_Login);
		
		JButton btn_Cancle = new JButton("Cancle");
		btn_Cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_Cancle.setBounds(343, 206, 115, 29);
		internalFrame_login.getContentPane().add(btn_Cancle);
		internalFrame_login.setVisible(true);
	}
}
