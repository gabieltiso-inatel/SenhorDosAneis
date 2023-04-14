package br.inatel.lab.habitante;

import br.inatel.lab.habitante.Habitante;
import br.inatel.lab.poderes.Cura;
import br.inatel.lab.poderes.Feitico;

public class Mago extends Habitante implements Feitico, Cura {
    private String cor;

    public Mago(int id, String nome, int idade, float energia, String cor) {
        super(id, nome, idade, energia);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void atacar() {
        System.out.println("Mago atacando...");
        super.atacar();
    }

    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("==== INFORMAÇÕES MAGO ====");
        System.out.printf("Tribo: %s\n", this.cor);
        System.out.println("==========================");
    }

    // Implementações das interfaces
    public void lancaFeitico() {
        if(super.energia <= 0) {
            System.out.println("O Mago está sem energia, não é possível lançar feitiço...");
            return;
        }

        super.energia *= 0.9;
        System.out.println("Mago lançando feitiço...");
    }

    public void curar() {
        super.energia += (super.energia * 0.15);
        System.out.println("Mago se curando...");
    }
}


