package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana3 extends JPanel {
	private JTextField textId;
	private JTextField textField;
	private JButton botonComprobar;
	private JTextField mensaje;
	private JButton button;

	/**
	 * Create the panel.
	 */
	public Ventana3() {
		setLayout(null);
		
		JLabel id = new JLabel("Id");
		id.setBounds(10, 30, 46, 14);
		add(id);
		
		textId = new JTextField();
		textId.setText("Id");
		textId.setBounds(10, 55, 46, 20);
		add(textId);
		
		JLabel lblerApellido = new JLabel("1er Apellido");
		lblerApellido.setBounds(86, 30, 80, 14);
		add(lblerApellido);
		
		textField = new JTextField();
		textField.setBounds(86, 55, 200, 20);
		add(textField);
		
		botonComprobar = new JButton("COMPROBAR");
		botonComprobar.setBounds(10, 120, 430, 23);
		add(botonComprobar);
		
		mensaje = new JTextField();
		mensaje.setText("Mensaje devuelto");
		mensaje.setBounds(10, 173, 430, 20);
		add(mensaje);
		
		button = new JButton("<< Atr\u00E1s");
		button.setBounds(10, 266, 141, 23);
		add(button);
		
		

	}

}
