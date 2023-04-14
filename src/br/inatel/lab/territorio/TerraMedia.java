package br.inatel.lab.territorio;

import br.inatel.lab.habitante.Anao;
import br.inatel.lab.habitante.Elfo;
import br.inatel.lab.habitante.Habitante;
import br.inatel.lab.habitante.Mago;

public class TerraMedia {
    private Habitante[] herois;

    public TerraMedia() {
        this.herois = new Habitante[6];
    }

    public Habitante[] getHerois() {
        return herois;
    }

    public void addHabitante(Habitante habitante) {
        for(int i = 0; i < this.herois.length; i++) {
           if(this.herois[i] == null) {
               this.herois[i] = habitante;
               break;
           }
        }
    }

    public void listarHabitantes() {
        for(int i = 0; i < this.herois.length; i++) {
           Habitante h = this.herois[i];

           // Métodos específicos de cada subclasse
           if(h != null) {
               if(h instanceof Anao) {
                   Anao ha = (Anao)h;
                   ha.atacar();
                   ha.mostraInfo();
               } else if(h instanceof Elfo) {
                   Elfo he = (Elfo)h;
                   he.atacar();
                   he.mostraInfo();
                   he.viajar();
               } else {
                   Mago hm = (Mago)h;
                   hm.atacar();
                   hm.mostraInfo();
                   hm.lancaFeitico();
                   hm.curar();
               }
           }
        }
    }
}
