/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAeronave;

/**
 *
 * @author Pedro
 */
public abstract class Aeronave implements Automotor {
    protected String fabricante;
    protected double preco;
    protected String modelo;
    protected boolean automatico;
    
    public Aeronave(String fabricante, double preco, String modelo){
        this.fabricante = fabricante;
        this.preco = preco;
        this.modelo = modelo;
    }
    
    public  abstract void acelerar(int marcha);
    
    @Override
    public void manutencao(){
        System.out.println("Aeronave enviada para manutencao");
    }

    @Override
    public String toString() {
        return "Fabricante: " + this.fabricante + ", Preco: " + this.preco + ", Modelo: " + this.modelo;
    }
    
    
}
