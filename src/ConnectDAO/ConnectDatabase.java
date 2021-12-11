/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author William Yamada
 */
public class ConnectDatabase {
    private static Connection CONNECTION = null;
    String url = "jdbc:mysql://localhost:3306/loja";
    String user = "root";
    String pass = "0800mx12#";
    
    public Connection getConnection(){
        //Tratamento de excessao com TRY/Catch
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            CONNECTION = DriverManager.getConnection(url, user, pass);
            
        }catch (SQLException error) {
            JOptionPane.showMessageDialog(null,"Erro na conecxao com o Banco de Dados" +  error.getMessage());
        }
        return CONNECTION;
    }
}