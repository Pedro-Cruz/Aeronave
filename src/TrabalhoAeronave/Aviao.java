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
public class Aviao extends Aeronave {

    private int qtdePassageiros;

    public Aviao(String fabricante, double preco, String modelo, int quantidade) {
        super(fabricante, preco, modelo);
        this.qtdePassageiros = quantidade;
    }

    public Aviao(double preco, String modelo, boolean automatico, int quantidade) {
        super("Boing", preco, modelo);
        this.qtdePassageiros = quantidade;
        this.automatico = automatico;
    }

    @Override
    public void acelerar() {
        System.out.println("Aviao automatico acelerando");
    }

    @Override
    public void acelerar(int marcha) {
        System.out.println("Aviao manual acelerando, usando a marcha " + marcha);
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    @Override
    public String toString() {
        if (automatico) {
            return super.toString() + ", Aviao Automatico - Informacoes da Aeronave, Quantidade de Passageiros: " + qtdePassageiros;
        } else {
            return super.toString() + ", Aviao Manual - Informacoes da Aeronave, Quantidade de Passageiros: " + qtdePassageiros;
        }

    }
}
