package entities;

import interfaces.Play;
import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Play, Volume {
    /*ATTRIBUTI*/
    private int durata;
    private int volume;

    /*COSTRUTTI*/
    public Audio(String name, int durata, int volume) {
        super(name);
        this.durata = durata;
        this.volume = volume;
    }

    /* METODI */
    @Override
    public void play() {
        System.out.println(this.name);
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.name + showVolume(this.volume));
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

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
