package backendclase22b.dao;

import backendclase22b.dominio.Entrenador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EntrenadorDAOH2 implements IDao<Entrenador>{
    @Override
    public List<Entrenador> listarTodos() {
        Connection connection= null;
        List<Entrenador> listaEntrenadores = new ArrayList<>();
        try {
            connection = BDH2.getConnection();
            PreparedStatement ps=connection.prepareStatement("select * from entrenadores");
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                Entrenador entrenador = new Entrenador(rs.getInt(1), rs.getString(2));
                listaEntrenadores.add(entrenador);
            }
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
        return listaEntrenadores;
    }
}
