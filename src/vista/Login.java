package vista;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Login extends JFrame implements ActionListener, DatosLogin {
	private JTextField textField_1;
	private JButton btnNewButton;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Login() {
		getContentPane().setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 1000, 600);
		setTitle("Hotel Alura");
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1000, 600);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.BOLD, 25));
		textField_1.setBounds(173, 211, 213, 40);
		textField_1.setColumns(10);
		textField_1.setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.white));
		textField_1.setForeground(Color.white);
		textField_1.setOpaque(false);
		panel.add(textField_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.BOLD, 25));
		passwordField.setBounds(173, 321, 213, 40);
		passwordField.setBorder(BorderFactory.createMatteBorder(0,0,2,0, Color.white));
		passwordField.setForeground(Color.white);
		passwordField.setOpaque(false);
		panel.add(passwordField);
		
		btnNewButton = new JButton("Ingresar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(217, 410, 127, 40);
		btnNewButton.addActionListener(this);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel.setBounds(170, 86, 270, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(173, 181, 116, 25);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(173, 291, 142, 25);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Oscar Martin  @2023");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBackground(new Color(0, 128, 255));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 520, 989, 42);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 1000, 600);
		panel.add(lblNewLabel_4);
		SetImage(lblNewLabel_4, "src/img/hotel_login.jpg");

	}


	public void actionPerformed(ActionEvent e) {
		String user= textField_1.getText();
		String pass= passwordField.getText();
		if(user.isEmpty() || pass.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Tienes algun campo vacio");
		}else if(user.equals(usuario) && pass.equals(password)){
			if (e.getSource()==btnNewButton) {
				JOptionPane.showMessageDialog(null, "Bienvenido");
				PantallaPrincipal principal= new PantallaPrincipal();
				principal.setVisible(true);
				this.dispose();
			}
		}else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
		}

	}
	
	private void SetImage(JLabel labelName, String root) {
		ImageIcon image = new ImageIcon(root);
		Icon icon = new ImageIcon(
				image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
		labelName.setIcon(icon);
		this.repaint();
	}
}
