/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ConnectDAO;

import Product.Jogos;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface DAO {
    void inserir(Jogos jogos);
    
    void atualizar(Jogos jogos);
    
    void remover(Jogos jogos);
    
    Jogos pesquisarId(int i);
    
    List<Jogos> getTodos();
}
