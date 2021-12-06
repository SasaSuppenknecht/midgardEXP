package com.example.midgardexpcalc;

import java.util.HashMap;

public class CharacterClass implements Comparable<CharacterClass> {

    private final String name;
    private final HashMap<SkillGroup, Integer> costPerGroup = new HashMap<>();

    public CharacterClass(String name) {
        this.name = name;
    }

    public void setCostPerGroup(SkillGroup group, int cost) {
        costPerGroup.put(group, cost);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(CharacterClass o) {
        return this.name.compareTo(o.name);
    }
}
