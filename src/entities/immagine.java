package entities;

import interfaces.Luminosità;

public class immagine extends ElementoMultimediale implements Luminosità {
    /*ATTRIBUTI*/
    private int luminosita;

    /*COSTRUTTI*/
    public immagine(String name, int luminosita) {
        super(name);
        this.luminosita = luminosita;
    }

    @Override
    public int abbassaLuminosita(int luminosita) {
        return luminosita - 1;
    }

    @Override
    public int alzaLuminosita(int luminosita) {
        return luminosita + 1;
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
