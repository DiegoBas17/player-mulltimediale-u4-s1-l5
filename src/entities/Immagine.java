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

    /*METODO*/
    public void show() {
        System.out.println(this.name + visualizzaLuminosita());

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
    public String visualizzaLuminosita() {
        String valoreLuminosita = "";
        for (int i = 1; i <= this.luminosita; i++) {
            valoreLuminosita += "*";
        }
        return valoreLuminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
