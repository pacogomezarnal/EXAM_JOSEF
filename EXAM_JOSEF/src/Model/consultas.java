package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class consultas {

	static final String BUSQUEDA="SELECT * FROM thelaby.cadetes WHERE id=19";
	
	private static String ID="id";
	private static String NOMBRE="nombre";
	private static String APELLIDOS="apellidos";
	private static String EDAD="edad";
	private static String NACIONALIDAD="nacionalidad";
	private static String EQUIPO="equipo";
	
	private ArrayList<String> consulta;
	

	private Connection conexion=null;
	Statement instruccion=null;
	ResultSet datosCadete=null;

	public consultas() {

		conexion=ConexionDB.getConexion();
		consulta=new ArrayList<String>();
	
	}

	public ArrayList getCadete(){
		try{
			// Realiza la consulta de cadetes
			instruccion=this.conexion.createStatement();
			datosCadete=instruccion.executeQuery(BUSQUEDA);
		   // Realiza el array de Usuarios para devolver la consulta
			while(datosCadete.next()){
			consulta.add(datosCadete.getString(NOMBRE));
			consulta.add(datosCadete.getString(APELLIDOS));
			int a=datosCadete.getInt(EDAD);
			String b=Integer.toString(a);
			consulta.add(b);
			consulta.add(datosCadete.getString(NACIONALIDAD));
			a=datosCadete.getInt(EQUIPO);
			b=Integer.toString(a);
			consulta.add(b);
		}
			return consulta;
		}
		catch(SQLException exceptionSql)
		{
			exceptionSql.printStackTrace();
			return consulta;
		}
		finally {
			 try{
				 datosCadete.close();
				instruccion.close();
			
			}catch(SQLException exceptionSql){
				exceptionSql.printStackTrace();
				
			}
		}
	}
	}
