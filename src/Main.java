import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Crea una Collezione di oggetti multimediali. Puoi aggiungere 5 oggetti nella versione gratuita, puoi scegliere tra: Audio, Video e Immagine.");
        ElementoMultimediale[] collezione = new ElementoMultimediale[5];
        for (int i = 0; i < 1; i++) {
            System.out.println("Inserisci il tipo del file tra: audio, video e immagine.");
            String nomeMultimediale = scanner.nextLine();
            switch (nomeMultimediale) {
                case "audio":
                    System.out.println("Inserisci il titolo del Audio");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Inserisci la durata del Audio");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume del Audio");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    collezione[i] = new Audio(titoloAudio, durataAudio, volumeAudio);
                    break;
                case "video":
                    System.out.println("Inserisci il titolo del video");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci la durata del video");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume del video");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la luminosità del video");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    collezione[i] = new Video(titoloVideo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case "immagine":
                    System.out.println("Inserisci il titolo dell'immagine");
                    String titoloImg = scanner.nextLine();
                    System.out.println("Inserisci la luminosità dell'immagine");
                    int luminositaImg = Integer.parseInt(scanner.nextLine());
                    collezione[i] = new Immagine(titoloImg, luminositaImg);
                    break;
                default:
                    System.out.println("Tipo non riconosciuto. sei un CLown!!");
                    System.out.println("Ricordati che devi scegliere tra audio, video o immagine");
                    i--;
                    break;
            }
        }
        int elementoInserito;
        while (true) {
            System.out.println("inserisci la posizione dell'elemento che vuoi riprodurre.");
            elementoInserito = Integer.parseInt(scanner.nextLine());
            if (elementoInserito == 0) {
                break;
            }
            int indexElemento = elementoInserito - 1;
            if (indexElemento >= 0 && indexElemento < collezione.length) {
                if (collezione[indexElemento] instanceof Immagine) {
                    Immagine immagine = (Immagine) collezione[indexElemento];
                    immagine.show();
                    System.out.println("Vuoi modificare la luminosita? Rispondi si o no.");
                    String modificaLuminosita = scanner.nextLine().toLowerCase();
                    if ("si".equals(modificaLuminosita)) {
                        System.out.println("Che luminosità vuoi impostare?");
                        int newLuminosita = Integer.parseInt(scanner.nextLine());
                        immagine.setLuminosita(newLuminosita);
                        immagine.show();
                    } else {
                        System.out.println("Goditi la riproduzione!");
                    }
                } else if (collezione[indexElemento] instanceof Video) {
                    Video video = (Video) collezione[indexElemento];
                    video.play();
                    System.out.println("Vuoi modificare qualcosa? se si, cosa? scrivi quello che vuoi modificare tra: Luminosità o volume. Altrimenti scrivi no.");
                    String modifica = scanner.nextLine().toLowerCase();
                    if (modifica.equals("luminosita")) {
                        System.out.println("Che luminosità vuoi impostare?");
                        int newLuminosita = Integer.parseInt(scanner.nextLine());
                        video.setLuminosita(newLuminosita);
                        video.play();
                    } else if (modifica.equals("volume")) {
                        System.out.println("Che luminosità vuoi impostare?");
                        int newVolume = Integer.parseInt(scanner.nextLine());
                        video.setVolume(newVolume);
                        video.play();
                    } else {
                        System.out.println("Goditi la riproduzione!");
                    }
                } else if (collezione[indexElemento] instanceof Audio) {
                    Audio audio = (Audio) collezione[indexElemento];
                    audio.play();
                    System.out.println("Vuoi modificare il volume? Rispondi si o no.");
                    String modificaAudio = scanner.nextLine().toLowerCase();
                    if ("si".equals(modificaAudio)) {
                        System.out.println("Che volume vuoi impostare?");
                        int newVolume = Integer.parseInt(scanner.nextLine());
                        audio.setVolume(newVolume);
                        audio.play();
                    } else {
                        System.out.println("Goditi la riproduzione!");
                    }
                }
            } else {
                System.out.println("Sei un clown! Indice inserito non valido! Ricorda che hai una collezione di 5 elementi nella versione gratuita! Se vuoi più elementi pagami millemila euro!!");
            }

        }
    }
}