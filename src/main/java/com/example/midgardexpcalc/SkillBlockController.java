package com.example.midgardexpcalc;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SkillBlockController extends BlockController {

    public ComboBox<Skill> fertigkeitsListe;
    public TextField alterWert;
    public TextField neuerWert;
    public TextField fertigkeitsKosten;

    public void initialize() {
        super.initialize();
    }

}
