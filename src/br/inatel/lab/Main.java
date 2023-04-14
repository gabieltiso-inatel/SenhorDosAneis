package br.inatel.lab;

import br.inatel.lab.armas.Arma;
import br.inatel.lab.habitante.Anao;
import br.inatel.lab.territorio.TerraMedia;
import br.inatel.lab.habitante.Elfo;
import br.inatel.lab.habitante.Habitante;
import br.inatel.lab.habitante.Mago;

public class Main {
   public static void main(String[] args) {
       // Instanciando os habitantes que habitarão a Terra Média
       Anao a1 = new Anao(1, "Marcos", 122, 200, 1.02f, "Reino 1");
       Anao a2 = new Anao(2, "Beto", 30, 175, 0.9f, "Reino 2");

       Elfo e1 = new Elfo(1, "Carlos", 122, 200, "Tribo 1");
       Elfo e2 = new Elfo(2, "Robson", 30, 175, "Tribo 2");

       Mago m1 = new Mago(1, "Júlio", 122, 200, "Vermelho");
       Mago m2 = new Mago(2, "Vitor", 30, 175, "Azul");

       // Instanciando as armas de cada habitante
       Arma arma1 = new Arma("Arco", false);
       Arma arma2 = new Arma("Espada", true);
       Arma arma3 = new Arma("Pedra", true);
       Arma arma4 = new Arma("Machado", false);
       Arma arma5 = new Arma("Adaga", true);
       Arma arma6 = new Arma("Lança", false);

       // Uma arma para cada habitante
       a1.setArma(arma1);
       a2.setArma(arma2);
       e1.setArma(arma3);
       e2.setArma(arma4);
       m1.setArma(arma5);
       m2.setArma(arma6);

       // Instanciando a Terra Média
       TerraMedia tm = new TerraMedia();
       System.out.printf("HABITANTES NA TERRA MÉDIA: %d\n", Habitante.contador);

       // Adicionando os habitantes
       tm.addHabitante(a1);
       tm.addHabitante(a2);
       tm.addHabitante(e1);
       tm.addHabitante(e2);
       tm.addHabitante(m1);
       tm.addHabitante(m2);

       tm.listarHabitantes();
   } 
}
