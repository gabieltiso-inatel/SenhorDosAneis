package br.inatel.lab.habitante;

import br.inatel.lab.habitante.Habitante;

public class Elfo extends Habitante {
    private String tribo;

    public Elfo(int id, String nome, int idade, float energia, String tribo) {
        super(id, nome, idade, energia);
        this.tribo = tribo;
    }

    public String getTribo() {
        return tribo;
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }

    public void viajar() {
        System.out.println("Elfo viajando...");
    }

    public void atacar() {
        System.out.println("Elfo atacando...");
        super.atacar();
    }

    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("==== INFORMAÇÕES ELFO ====");
        System.out.printf("Tribo: %s\n", this.tribo);
        System.out.println("==========================");
    }
}

