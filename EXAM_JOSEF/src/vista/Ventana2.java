package vista;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana2 extends JPanel {
	
	private JTextField txtNombre;
	private JTextField txtapellidos;
	private JTextField txtedad;
	private JTextField txtNacionalidad;
	private JTextField txtId;


	/**
	 * Create the panel.
	 */
	public Ventana2() {
		setLayout(null);
		
		JComboBox comboequipo = new JComboBox();
		comboequipo.setBounds(10, 49, 100, 20);
		comboequipo.addItem("Equipo");
		add(comboequipo);
		
		JLabel equipo = new JLabel("Equipo");
		equipo.setBounds(10, 32, 46, 14);
		add(equipo);
		
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
		
		JLabel id = new JLabel("Id");
		id.setBounds(338, 25, 46, 14);
		add(id);
		
		txtId = new JTextField();
		txtId.setText("Id");
		txtId.setEditable(false);
		txtId.setColumns(10);
		txtId.setBounds(338, 45, 50, 20);
		add(txtId);

		
		JButton botonSiguiente = new JButton("Siguiente>>");
		botonSiguiente.setBounds(270, 266, 129, 23);
		add(botonSiguiente);
		
		JButton botonAtras = new JButton("<< Atr\u00E1s");
		botonAtras.setBounds(10, 266, 141, 23);
		add(botonAtras);

	}
}
