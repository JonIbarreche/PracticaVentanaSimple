import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LoginWindowJ extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField pwdPassword;
	private JLabel lblUsuario;
	private JLabel lblClave;

	

	/**
	 * Create the frame.
	 */
	public LoginWindowJ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 432);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 209, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLogin.setBounds(290, 10, 126, 88);
		contentPane.add(lblLogin);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(263, 108, 138, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setHorizontalAlignment(SwingConstants.CENTER);
		pwdPassword.setBounds(263, 172, 138, 32);
		contentPane.add(pwdPassword);
		
		JButton btnAcceder = new JButton("ACCEDER");
		btnAcceder.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAcceder.setBounds(282, 239, 103, 32);
		contentPane.add(btnAcceder);
		
		lblUsuario = new JLabel("USUARIO");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblUsuario.setForeground(new Color(0, 0, 0));
		lblUsuario.setBounds(263, 85, 103, 21);
		contentPane.add(lblUsuario);
		
		lblClave = new JLabel("CLAVE");
		lblClave.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblClave.setBounds(263, 150, 103, 21);
		contentPane.add(lblClave);
	}
}
