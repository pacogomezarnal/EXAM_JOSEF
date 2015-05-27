package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JPanel {

	private Ventana2 v2=new Ventana2();
	private JTextField txtNombre;
	private JTextField txtapellidos;
	private JTextField txtedad;
	private JTextField txtNacionalidad;
	private JTextField txtId;

	/**
	 * Create the panel.
	 */
	public Ventana1() {
		setLayout(null);
		
		JLabel foto = new JLabel("");
		foto.setIcon(new ImageIcon(Ventana1.class.getResource("/imagenes/imagen1.jpg")));
		foto.setBounds(10, 10, 120, 120);
		add(foto);
		
		JLabel nombre = new JLabel("Nombre");
		nombre.setBounds(160, 25, 50, 15);
		add(nombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setText("Nombre");
		txtNombre.setBounds(160, 45, 141, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel apellidos = new JLabel("Apellidos");
		apellidos.setBounds(160, 70, 50, 15);
		add(apellidos);
		
		JLabel edad = new JLabel("Edad");
		edad.setBounds(160, 121, 50, 15);
		add(edad);
		
		JLabel nacionalidad = new JLabel("Nacionalidad");
		nacionalidad.setBounds(160, 169, 141, 15);
		add(nacionalidad);
		
		txtapellidos = new JTextField();
		txtapellidos.setText("Apellidos");
		txtapellidos.setEditable(false);
		txtapellidos.setColumns(10);
		txtapellidos.setBounds(160, 90, 141, 20);
		add(txtapellidos);
		
		txtedad = new JTextField();
		txtedad.setText("Edad");
		txtedad.setEditable(false);
		txtedad.setColumns(10);
		txtedad.setBounds(160, 138, 141, 20);
		add(txtedad);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setText("Nacionalidad");
		txtNacionalidad.setEditable(false);
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(160, 193, 141, 20);
		add(txtNacionalidad);
		
		JButton botonSiguiente = new JButton("Siguiente>>");
		botonSiguiente.setBounds(270, 266, 129, 23);
		add(botonSiguiente);
		
		JLabel id = new JLabel("Id");
		id.setBounds(338, 25, 46, 14);
		add(id);
		
		txtId = new JTextField();
		txtId.setText("Id");
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBounds(338, 45, 50, 20);
		add(txtId);

	}
}
