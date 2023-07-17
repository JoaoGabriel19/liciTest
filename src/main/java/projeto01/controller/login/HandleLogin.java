package projeto01.controller.login;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HandleLogin {

	public boolean login(JTextField username, JPasswordField password) {
		String user = username.getText();
		char[] pw = password.getPassword();
		String passwordString = pw.toString();
		return false;
	}
}
