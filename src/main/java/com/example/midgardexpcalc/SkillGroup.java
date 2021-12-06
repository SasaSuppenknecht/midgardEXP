package com.example.midgardexpcalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public enum SkillGroup {
    ALLTAG(1, 1, 2, 10),
    FREILAND(1, 2, 4),
    HALBWELT(1, 2, 2, 10),
    KAMPF(1, 2, 10, 10),
    KÖRPER(1, 1, 2),
    SOZIAL(2, 2, 4),
    UNTERWELT(2, 4, 10),
    WAFFEN(2, 4, 6, 8),
    WISSEN(1, 2, 2);

    public SkillGroup getSkillGroupByName(String name) {
        return SkillGroup.valueOf(name.toUpperCase(Locale.ROOT));
    }

    private final ArrayList<TupelSkillStufe> skillList = new ArrayList<>();
    private final int[] cost;

    SkillGroup(int ... lePerLevel) {
        cost = lePerLevel;

    }

    private int getCostInLe(Skill skill) {
        return 0;
    }

    private class TupelSkillStufe {

        public final Skill skill;
        public final Stufe stufe;

        public TupelSkillStufe(Skill skill, Stufe stufe) {
            this.skill = skill;
            this.stufe = stufe;
        }

    }
}
