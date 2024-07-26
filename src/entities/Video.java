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
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.name);
        }
    }

    @Override
    public void abbassaVolume() {
        this.volume -= 1;
    }

    @Override
    public void alzaVolume() {
        this.volume += 1;
    }

    @Override
    public String showVolume() {
        String valoreVolume = "";
        for (int i = 0; i <= this.volume; i++) {
            valoreVolume += "!";
        }
        return valoreVolume;
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
