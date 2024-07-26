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
    public void play(int durata) {
        for (int i = 0; i < durata; i++) {
            System.out.println(this.name + showVolume(this.volume));
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

}
