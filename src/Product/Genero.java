/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author Usuario
 */
public class Genero {
    private int id;
    private String nome;
    
    public Genero(int id, String nome){
        this.nome = nome;
        this.id = id;
    }
    public Genero(){
        
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Genero{" + "nome=" + nome + '}';
    }
    
    
    
}
