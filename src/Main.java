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
        for (int i = 0; i < 5; i++) {
            String nomeMultimediale = scanner.nextLine();
            switch (nomeMultimediale) {
                case "audio":
                    System.out.println("Inserisci il titolo del Audio");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Inserisci la durata del Audio");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume del Audio");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la luminosità del Audio");
                    int luminositaAudio = Integer.parseInt(scanner.nextLine());
                    collezione[i] = new Audio(titoloAudio, durataAudio, volumeAudio);
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
    }
}