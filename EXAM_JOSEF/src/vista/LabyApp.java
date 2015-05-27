package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Cadete;
import Model.ConexionDB;
import Model.consultas;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Iterator;

public class LabyApp extends JFrame {

	private JPanel contenedorPrincipal;
	
	Ventana1 ventana1=new Ventana1();
	Ventana2 ventana2=new Ventana2();
	Ventana3 ventana3=new Ventana3();
	static ConexionDB conexion;
	static Cadete consulta;
	private static ArrayList<String> respuestaConsulta;
	
	
	public static void main(String[] args) {
	consultas consultas;

		conexion= new ConexionDB("localhost","thelaby","root","");
		if (conexion.connectDB()==true){
			System.out.println("Exito de conexión!!!");
			consultas=new consultas();			
			Iterator<String> it=(Iterator<String>) consultas.getCadete().iterator();
			while(it.hasNext()){
				(respuestaConsulta).addItem((String)it.next());}
			
		}else{
			System.out.print("Fallo de conexión!!!");
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LabyApp frame = new LabyApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public LabyApp() {
		setTitle("THE LABY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contenedorPrincipal = new JPanel();
		contenedorPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contenedorPrincipal);
		contenedorPrincipal.setLayout(new CardLayout(0, 0));
		add(ventana1);
		
	}

}
