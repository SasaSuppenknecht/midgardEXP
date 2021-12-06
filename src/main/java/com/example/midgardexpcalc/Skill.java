package com.example.midgardexpcalc;

public class Skill {

    private final String name;
    private final SkillGroup group1, group2;

    public Skill(String name, SkillGroup skillGroup) {
        this.name = name;
        this.group1 = skillGroup;
        this.group2 = null;
    }

    public Skill(String name, SkillGroup skillGroup1, SkillGroup skillGroup2) {
        this.name = name;
        this.group1 = skillGroup1;
        this.group2 = skillGroup2;
    }

}
