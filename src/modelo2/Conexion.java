/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Alvaro Escobar
 */
public class Conexion {
    //nombre del servidor de base de datos: localhost
    
   /*
    puerto =3306
    urlConexion = jdbc:mysql//localhost:3306/db_empresa
    usuario =root
    contraseña: Admin@123
    Driver de Conexion (jdbc) = com.mysql.cj.jdbc.jdcb.Driver;
    */
    
private final String puerto = "3306";
private final String db = "db_empleadosumg";
private final String urlConexion =String.format( "jdbc:mysql://localhost:%s/%s?serverTimezone=UTC",puerto,db); //"jdbc:mysql://localhost:"+puerto+"/"+ db +"
private final String usuario ="root";
private final String contra ="52935159";
private final String jdbc = "com.mysql.cj.jdbc.Driver";
public Connection conexionBD;
public void abrir_conexion (){
    try{
        Class.forName(jdbc);
        conexionBD = DriverManager.getConnection(urlConexion,usuario,contra);
        
        System.out.println("Conexion exitosa...");
    }
    catch(ClassNotFoundException | SQLException ex){
        System.out.println("Algo salio mal :" + ex.getMessage());
    }
}

public void cerrar_conexion (){
    try{
        conexionBD.close();
    }
    catch(SQLException ex){
        System.out.println("Algo salio mal :" + ex.getMessage());
    }
}

}