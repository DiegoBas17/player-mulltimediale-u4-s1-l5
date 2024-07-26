package entities;

import interfaces.Luminosità;
import interfaces.Play;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Play, Volume, Luminosità {
    /*ATTRIBUTI*/
    private int durata;
    private int volume;
    private int luminosita;

    /*COSTRUTTI*/
    public Video(String name, int durata, int luminosita, int volume) {
        super(name);
        this.durata = durata;
        this.luminosita = luminosita;
        this.volume = volume;
    }

    /* METODI */
    @Override
    public void play(int durata) {
        for (int i = 0; i < durata; i++) {
            System.out.println(this.name);
        }
    }

    @Override
    public int abbassaVolume() {
        return this.volume - 1;
    }

    @Override
    public int alzaVolume() {
        return this.volume + 1;
    }

    @Override
    public String showVolume(int volume) {
        String valoreVolume = "";
        for (int i = 0; i <= volume; i++) {
            valoreVolume += "!";
        }
        return valoreVolume;
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
