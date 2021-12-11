/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDAO;

import Product.Genero;
import Product.Jogos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class GeneroDao {
    private final Connection connection;
    PreparedStatement command;
    ResultSet result;
    
    public GeneroDao(){
        connection = new ConnectDatabase().getConnection();
    }
    

    public void inserir(Genero genero) {
        String insert = "insert into Genero" 
                + "(nome) "
                + "values (?)";
        try {
            command = connection.prepareStatement(insert);
            command.setString(1, genero.getNome());
            command.execute();
            command.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Genero> getTodos(Genero genero) {
        String tGenero = "SELECT * FROM Genero";
        
        try {
            command = connection.prepareStatement(tGenero);
            /*
            for(int i=0; i<command.setInt(i, genero.getId()); i++){
               
            }
            */
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null ;
    }
    
}
