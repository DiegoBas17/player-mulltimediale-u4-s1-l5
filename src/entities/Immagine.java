package entities;

import interfaces.Luminosità;

public class Immagine extends ElementoMultimediale implements Luminosità {
    /*ATTRIBUTI*/
    private int luminosita;

    /*COSTRUTTI*/
    public Immagine(String name, int luminosita) {
        super(name);
        this.luminosita = luminosita;
    }

    @Override
    public void abbassaLuminosita() {
        this.luminosita -= 1;
    }

    @Override
    public void alzaLuminosita() {
        this.luminosita += 1;
    }

    @Override
    public String visualizzaLuminosita(int luminosita) {
        String valoreLuminosita = "";
        for (int i = 0; i <= luminosita; i++) {
            valoreLuminosita += "*";
        }
        return valoreLuminosita;
    }
}
