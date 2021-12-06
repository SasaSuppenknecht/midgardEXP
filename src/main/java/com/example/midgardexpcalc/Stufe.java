package com.example.midgardexpcalc;

public enum Stufe {
    LEICHT, NORMAL, SCHWER, SEHR_SCHWER;

    public Stufe getStufeByNumber(int i) {
        if (i < 1 || i > Stufe.values().length) throw new IllegalArgumentException("Value must be between 1 and " + Stufe.values().length);
        return Stufe.values()[i-1];
    }

    public int getNumberByStufe(Stufe s) {
        int result = -1;
        switch (s) {
            case LEICHT -> result = 1;
            case NORMAL -> result = 2;
            case SCHWER -> result = 3;
            case SEHR_SCHWER -> result = 4;
        }

        return result;
    }
}
