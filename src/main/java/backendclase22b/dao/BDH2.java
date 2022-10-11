package backendclase22b.dao;

import backendclase22b.dominio.Entrenador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BDH2 {
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/clase22b","sa","sa");
    }
    public static  void cargarBD(){
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection=DriverManager.getConnection("jdbc:h2:~/clase22b;init=runscript from 'create.sql'","sa","sa");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
