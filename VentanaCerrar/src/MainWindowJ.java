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
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JMenuItem;

public class MainWindowJ extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField pwdPassword;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JLabel lblUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowJ frame = new MainWindowJ();
					frame.setVisible(true);
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
	public MainWindowJ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 458);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVentanaDePrueba = new JLabel("VENTANA DE PRUEBA");
		lblVentanaDePrueba.setFont(new Font("Yu Gothic Medium", Font.BOLD, 21));
		lblVentanaDePrueba.setBounds(241, 21, 240, 43);
		contentPane.add(lblVentanaDePrueba);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("USUARIO");
		txtUsuario.setBounds(31, 118, 131, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("PASSWORD");
		pwdPassword.setBounds(31, 163, 131, 19);
		contentPane.add(pwdPassword);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 203, 222, 19);
		contentPane.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(219, 74, 94, 132);
		contentPane.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(0, 74, 222, 19);
		contentPane.add(separator_2);
		
		lblUsuario = new JLabel("REGISTRO");
		lblUsuario.setBounds(70, 95, 113, 13);
		contentPane.add(lblUsuario);
		
		JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBounds(427, 162, 49, 21);
		contentPane.add(rdbtnA);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(478, 162, 49, 21);
		contentPane.add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(533, 162, 49, 21);
		contentPane.add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setBounds(591, 162, 49, 21);
		contentPane.add(rdbtnD);
		
		JLabel lblLetraPorLa = new JLabel("Letra por la que empieza la CAPITAL DE BELGICA");
		lblLetraPorLa.setFont(new Font("Sylfaen", Font.BOLD, 11));
		lblLetraPorLa.setBounds(421, 111, 265, 39);
		contentPane.add(lblLetraPorLa);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setBounds(210, 362, 271, 28);
		contentPane.add(progressBar);
		
		JMenu mnPrueba = new JMenu("JMenu");
		mnPrueba.setBackground(new Color(0, 191, 255));
		mnPrueba.setBounds(25, 232, 113, 39);
		contentPane.add(mnPrueba);
		
		JMenuItem mntmVentana = new JMenuItem("Ventana 1");
		mnPrueba.add(mntmVentana);
		
		JMenuItem mntmVentana_1 = new JMenuItem("Ventana 2");
		mnPrueba.add(mntmVentana_1);
		
		JMenuItem mntmVentana_2 = new JMenuItem("Ventana 3");
		mnPrueba.add(mntmVentana_2);
		
		JMenuItem mntmVentana_3 = new JMenuItem("Ventana 4");
		mnPrueba.add(mntmVentana_3);
	}
}
