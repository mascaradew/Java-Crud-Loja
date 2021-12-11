/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDAO;

import Product.Jogos;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author William Yamada
 */
public class JogosDao implements DAO{
    private Connection connection;
    PreparedStatement command;
    ResultSet result;
    
    public JogosDao(){
        connection = new ConnectDatabase().getConnection();
    }
    
    @Override
    public void inserir(Jogos jogos) {
        String insert = "insert into Jogos" 
                + "(titulo, descricao, preco, estoque, desenvolvedor, ID_genero) "
                + "values (?, ?, ?, ?, ?, ?)";
        try {
            command = connection.prepareStatement(insert);
            command.setString(1, jogos.getTitulo());
            command.setString(2, jogos.getDescricao());
            command.setDouble(3, jogos.getPreco());
            command.setInt(4, jogos.getEstoque());
            command.setString(5, jogos.getDesenvolvedor());
            command.setInt(6,jogos.getidGenero() );
            command.execute();
            command.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar(Jogos jogos) {
       String update = "UPDATE Jogos SET titulo = ?, descricao = ?,"
                        + "preco = ?, estoque = ?, desenvolvedor = ?, ID_genero = ?"
                        + "WHERE ID_jogo = ?";
       try {
           command = connection.prepareStatement(update);
           command.setString(1, jogos.getTitulo());
           command.setString(2, jogos.getDescricao());
           command.setDouble(3, jogos.getPreco());
           command.setInt(4, jogos.getEstoque());
           command.setString(5, jogos.getDesenvolvedor());
           command.setInt(6,jogos.getidGenero() );
           command.setInt(7, jogos.getId());
           command.executeUpdate();
           command.close();
           
       } catch(SQLException error){
           System.out.println("Erro ao atualizar!" + error);
       }
    }

    @Override
    public void remover(Jogos jogos) {
        String remover = "DELETE FROM Jogos WHERE ID_jogo = ?";
        
        try {
            command = connection.prepareStatement(remover);
            command.setInt(1, jogos.getId());
            command.executeUpdate();
            command.close();
        } catch (SQLException ex) {
            Logger.getLogger(JogosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Jogos pesquisarId(int i) {
        return null;
       
    }

    @Override
    public List<Jogos> getTodos() {
        return null;
       
    }
    
}
