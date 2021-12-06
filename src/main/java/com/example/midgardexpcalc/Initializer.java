package com.example.midgardexpcalc;

import javafx.collections.ObservableList;

import java.io.*;
import java.util.StringTokenizer;

public class Initializer {

    private static final String CHARACTER_CLASS_PATH = "data/klassen.txt";

    public static void initClasses(ObservableList<CharacterClass> list) {
        SkillGroup[] skillGroups = SkillGroup.values();
        final int numberOfGroups = skillGroups.length;

        InputStream input = Initializer.class.getResourceAsStream(CHARACTER_CLASS_PATH);
        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(input));
        } catch (NullPointerException e) {
            e.printStackTrace();
            return;
        }


        try {
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                CharacterClass characterClass = new CharacterClass(tokenizer.nextToken());
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    try {
                        characterClass.setCostPerGroup(skillGroups[i], Integer.parseInt(token));
                    } catch (NumberFormatException e) {
                        break;
                    }
                    i++;
                }

                if (i == numberOfGroups) list.add(characterClass);
                i = 0;

                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        list.sort(CharacterClass::compareTo);
    }

    public static void initSkills() {

    }

}
