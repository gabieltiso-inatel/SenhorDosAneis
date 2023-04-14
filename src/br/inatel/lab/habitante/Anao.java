package br.inatel.lab.habitante;

import br.inatel.lab.habitante.Habitante;
import br.inatel.lab.poderes.Mineracao;

public class Anao extends Habitante implements Mineracao {
    private float altura;
    private String reino;

    public Anao(int id, String nome, int idade, float energia, float altura, String reino) {
        super(id, nome, idade, energia);
        this.altura = altura;
        this.reino = reino;
    }

    public float getAltura() {
        return altura;
    }

    public String getReino() {
        return reino;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public void atacar() {
        System.out.println("Anão atacando...");
        super.atacar();
    }

    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("==== INFORMAÇÕES ANÃO ====");
        System.out.printf("Altura: %.1f m\nReino: %s\n", this.altura, this.reino);
        System.out.println("==========================");
    }

    // Implementação de interfaces
    @Override
    public void minerar() {
        System.out.println("Anão está minerando...");
    }
}
