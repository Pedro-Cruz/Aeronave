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
public class Helicoptero extends Aeronave {

    private float potencia;
    private boolean estaGalpao;
    private static int qtdeHelicopteroGalpao = 0;
    public final int MAXHELICOPTEROGALPAO = 3;

    public Helicoptero(String fabricante, double preco, String modelo, boolean automatico, float potencia) {
        super(fabricante, preco, modelo);
        this.potencia = potencia;
        this.automatico = automatico;
        if (qtdeHelicopteroGalpao < 4) {
            this.estaGalpao = true;
            qtdeHelicopteroGalpao++;
        } else {
            this.estaGalpao = false;
        }
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public static int getQtdeHelicopteroGalpao() {
        return qtdeHelicopteroGalpao;
    }

    public static void setQtdeHelicopteroGalpao(int qtdeHelicopteroGalpao) {
        Helicoptero.qtdeHelicopteroGalpao = qtdeHelicopteroGalpao;
    }

    @Override
    public void acelerar() {
        System.out.println("Helicoptero automatico acelerando");
    }

    @Override
    public void acelerar(int marcha) {
        System.out.println("Helicoptero manual acelerando, usando a marcha " + marcha);
    }

    @Override
    public void manutencao() {
        System.out.println("Aeronave enviada para manutencao");
        this.estaGalpao = false;
    }

    @Override
    public String toString() {
        if (automatico) {
            if (estaGalpao) {
                return super.toString() + ", Helicoptero Automatico - Informacoes da Aeronave, Cilindradas: " + potencia + ". Esta no Galpao";

            } else {
                return super.toString() + ", Helicoptero Automatico - Informacoes da Aeronave, Cilindradas: " + potencia + ". Nao esta no Galpao";

            }
        } else {
            if (estaGalpao) {
                return super.toString() + ", Helicoptero Manual - Informacoes da Aeronave, Cilindradas: " + potencia + ". Esta no Galpao";

            } else {
                return super.toString() + ", Helicoptero Manual - Informacoes da Aeronave, Cilindradas: " + potencia + ". Nao esta no Galpao";
            }
        }

    }

}
