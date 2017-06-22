/**
 * package should be the first statement
 */

package com.login.view;
import java.awt.*;
import javax.swing.*;


/**
 * @author Admin
 *
 */
public class LoginView {
	public void createWindow(){
		JFrame frame = new JFrame("SimpleGui");
		JLabel textLabel = new JLabel("Username");
		JTextField jtf = new JTextField(40);
		JLabel textLabel1 = new JLabel("Password");
		JPasswordField jpf = new JPasswordField(40);
		JPanel userP = new JPanel();
		JPanel passP = new JPanel();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout exp = new FlowLayout();
		frame.setLayout(exp);
		
		frame.getContentPane().add(userP);
		frame.getContentPane().add(passP);
		
		userP.add(textLabel);
		userP.add(jtf);
		
		passP.add(textLabel1);
		passP.add(jpf);
		
		frame.pack();
		frame.setVisible(true);
	}

}
