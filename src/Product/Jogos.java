/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author Usuario
 */
public class Jogos extends Produto{
   // private String genero;
    private String desenvolvedor;
    private int idGenero;
    
    public Jogos(int id, String titulo, String descricao, int estoque, double preco, String desenvolvedor, int idGenero) {
        super(id, titulo, descricao, estoque, preco);
        
        this.idGenero = idGenero;
        this.desenvolvedor = desenvolvedor;
    }
    
    public Jogos(){
        
    }

    public int getidGenero() {
        return idGenero;
    }
    public void setidGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }
    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    @Override
    public String toString() {
        return super.toString() + "Jogos{" + "Genero= " + idGenero + " desenvolvedor=" + desenvolvedor + '}';
    }
    
    
    
    
    
    
    
}
