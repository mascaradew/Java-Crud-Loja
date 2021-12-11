/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author Usuario
 */
public abstract class Produto {
    private int id;
    private String titulo;
    private String descricao;
    private int estoque;
    private double preco;
    
    //Metodo Construtor
    Produto(){
        
    }
    
    Produto(int id, String titulo, String descricao, int estoque, double preco){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.estoque = estoque;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", titulo=" + titulo + ", descricao=" + descricao + ", estoque=" + estoque + ", preco=" + preco + '}';
    }
    
    
    
}
