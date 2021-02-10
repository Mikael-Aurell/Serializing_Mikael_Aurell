package se.lexicon;


import se.lexicon.model.Music;
import se.lexicon.util.SerializationUtil;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<Music> musics = new ArrayList<>();
        Music appMusic = new Music(1,"Aviccii","Level");
        Music appMusic2 = new Music(2,"Aviccii","Heaven");

        musics.add(appMusic);
        musics.add(appMusic2);
        SerializationUtil.serializeMusic(musics,"musics.ser");
    }
}
