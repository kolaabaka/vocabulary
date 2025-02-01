package com.fx.vocabulary.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class VocabularyUtil {

    private static final String PATH_VOC = "src/main/resources/ENRUS.txt";
    private static HashMap<String,String> vocabularu = new HashMap<>();

    public static void initVoc() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(PATH_VOC));
        String h1 = reader.readLine();
        String h2 = reader.readLine();

        while(h2 != null){
            vocabularu.put(h1, h2);
            h1 = reader.readLine();
            h2 = reader.readLine();
        }
    }

    public static String translate(String key){
        return vocabularu.get(key);
    }

}
