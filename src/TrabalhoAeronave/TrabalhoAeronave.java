/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoAeronave;

import java.util.ArrayList;

/**
 *
 * @author Pedro
 */

public class TrabalhoAeronave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Aeronave> aeronaves = new ArrayList();

        aeronaves.add(new Helicoptero("H1", 1000, "F3", true, 10));
        aeronaves.add(new Helicoptero("663", 1000, "YY", false, 22));
        aeronaves.add(new Aviao("TAM", 6665, "TTT", 230));
        aeronaves.add(new Aviao("GOL", 150, "QRW", 400));
        aeronaves.add(new Helicoptero("RTX", 1000, "F3", true, 96));
        aeronaves.add(new Aviao(5000, "XLR", true, 50));
        aeronaves.add(new Helicoptero("OPUS", 1000, "F3", false, 110));
        aeronaves.add(new Aviao(2620, "YKT", false, 150));
        aeronaves.add(new Helicoptero("Z", 1000, "F3", true, 1000));
        aeronaves.add(new Aviao("GOL", 15418, "Air", 500));

        aeronaves.get((int) (Math.random() * (aeronaves.size()))).manutencao();
        aeronaves.get((int) (Math.random() * (aeronaves.size()))).manutencao();

        for (int i = 0; i < aeronaves.size(); i++) {
            System.out.println(aeronaves.get(i).toString());
        }

        for (int i = 0; i < aeronaves.size(); i++) {
            if ((Math.random() * (aeronaves.size())) % 2 == 0) {
                aeronaves.get(i).acelerar();
            } else {
                aeronaves.get(i).acelerar((int)(Math . random () * (aeronaves.size())));
            }

        }

    }

}
