package se.lexicon.util;

import se.lexicon.model.Music;

import java.io.*;
import java.util.List;

public class SerializationUtil {

    public static List<Music> serializeMusic(List<Music> source, String filePath) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        ) {
            out.writeObject(source);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return source;
    }
}
