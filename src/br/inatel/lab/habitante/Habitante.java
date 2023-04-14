package br.inatel.lab.habitante;

import br.inatel.lab.armas.Arma;

public abstract class Habitante {
    public static int contador = 0;

    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;

    private Arma arma;

    public Habitante(int id, String nome, int idade, float energia) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;

       contador++;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacar() {
        System.out.println("Habitante atacando...");

        boolean possuiArmaMagica = arma.getMagica();
        if(possuiArmaMagica) {
            this.energia -= 20;
        } else {
            this.energia -= 10;
        }

        System.out.println("Atributos da arma do habitante: ");
        System.out.printf("Nome: %s\n", arma.getNomeArma());
        if(possuiArmaMagica) {
            System.out.println("Arma é mágica: Sim");
        } else {
            System.out.println("Arma é mágica: Não");
        }
    }

    public void mostraInfo() {
        System.out.println("==== INFO HABITANTE ====");
        System.out.printf("Id: %d\nNome: %s\nIdade: %d\nEnergia: %.2f\n",
                this.id, this.nome, this.idade, this.energia);
    }
}
