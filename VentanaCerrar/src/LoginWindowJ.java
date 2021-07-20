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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWindowJ extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername1;
	private JPasswordField txtPassword1;
	private JLabel lblUsuario;
	private JLabel lblClave;
	private JLabel lblLoginMessage1 = new JLabel("");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//MainWindowJ frame = new MainWindowJ();
					//frame.setVisible(true);
					LoginWindowJ frame1 = new LoginWindowJ();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


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
		
		txtUsername1 = new JTextField();
		txtUsername1.setHorizontalAlignment(SwingConstants.CENTER);
		txtUsername1.setBounds(263, 108, 138, 32);
		contentPane.add(txtUsername1);
		txtUsername1.setColumns(10);
		
		txtPassword1 = new JPasswordField();
		txtPassword1.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword1.setBounds(263, 172, 138, 32);
		contentPane.add(txtPassword1);
		
		JButton btnAcceder = new JButton("ACCEDER");
		btnAcceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login(txtPassword1, txtUsername1);
			}
		});
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
		
		JLabel lblLoginMessage1 = new JLabel("");
		lblLoginMessage1.setForeground(Color.RED);
		lblLoginMessage1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginMessage1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLoginMessage1.setBounds(219, 281, 228, 13);
		contentPane.add(lblLoginMessage1);
	}
	

	/**
	 * Metodo que para hacer login. Hay varias comprobaciones para que no se permita
	 * añadir un campo vacio y para que el usuario y contraseña sean correctos
	 *
	 */
	public void Login(JPasswordField txtPassword1, JTextField txtUsername1) {
		if (txtUsername1.getText().equals("admin") && txtPassword1.getText().equals("admin")) {
			lblLoginMessage1.setText("");
			MainWindowJ frame = new MainWindowJ();
			frame.setVisible(true);
			//MainWindowJ mwj = new MainWindowJ();
			//mwj.setVisible(true);
			dispose();

		} else if (txtUsername1.getText().equals("") || txtUsername1.getText().equals("Username")
				|| txtPassword1.getText().equals("") || txtPassword1.getText().equals("Password")) {
			lblLoginMessage1.setText("Por favor rellena los campos!");
		} else {
			lblLoginMessage1.setText("Usuario y contraseña no coinciden");
		}
	
	}
}

