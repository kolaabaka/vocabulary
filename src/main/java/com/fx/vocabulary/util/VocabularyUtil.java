package com.fx.vocabulary.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Optional;

public class VocabularyUtil {

    private static final String PATH_VOC_RESERVE = "src/main/resources/ENRUS.txt";
    private static HashMap<String,String> vocabularu = new HashMap<>();

    public static void initVoc(String args[]) throws IOException {
        BufferedReader reader;
        if(args.length != 0){
            reader = new BufferedReader(new FileReader(args[0]));
        } else {
            reader = new BufferedReader(new FileReader(PATH_VOC_RESERVE));
        }
        Optional<String> h1 = Optional.ofNullable(reader.readLine());
        Optional<String> h2 = Optional.ofNullable(reader.readLine());

        while(h2.isPresent()){
            vocabularu.put(h1.get(), h2.get());
            h1 = Optional.ofNullable(reader.readLine());
            h2 = Optional.ofNullable(reader.readLine());
            if(h2.isPresent()){
                byte[] buf = h2.get().getBytes();
                h2 = Optional.of(new String(buf, StandardCharsets.UTF_8));
            }
        }
    }

    public static String translate(String key){
        return vocabularu.get(key);
    }

}
