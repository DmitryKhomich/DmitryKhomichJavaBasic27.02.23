package main.java.hw17Polymorphism;

import java.util.ArrayList;

public class Main {
    protected static ArrayList<MusicStyles> bandsList = new ArrayList<>();

    public static void main(String[] args) {
        MusicStyles popMusicBand = new PopMusic();
        MusicStyles classicMusicBand = new ClassicMusic();
        MusicStyles rockMusicBand = new RockMusic();

        addBandToList(popMusicBand);
        addBandToList(classicMusicBand);
        addBandToList(rockMusicBand);

        for(MusicStyles bands : bandsList){
            bands.playMusic();
        }
    }

    protected static void addBandToList(MusicStyles musicStyles){
        bandsList.add(musicStyles);
    }
}
