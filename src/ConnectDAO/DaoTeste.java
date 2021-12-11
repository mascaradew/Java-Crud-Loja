/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDAO;

import Product.Genero;
import Product.Jogos;

/**
 *
 * @author Usuario
 */
public class DaoTeste {
    public static void main(String[] args){
        JogosDao games = new JogosDao();
        GeneroDao geral = new GeneroDao();
        
        Genero ficcao = new Genero(7,"Ficção Cientifica");
        geral.inserir(ficcao);
        
        Jogos god = new Jogos(1, "God of War", "Kratos vai em busca de vingança vai atras dos deuses",
                            34, 299.00, "Riot Games", ficcao.getId());
        games.inserir(god);
        
        Jogos godshadow = new Jogos();
        //godshadow.setTitulo("GOD OF WAR SHADOW");
        //godshadow.setId(1);
        //games.remover(godshadow);
        
        //System.out.println(god);
    }
    
    
}
