package com.example.midgardexpcalc;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

import java.io.IOException;

public class MainController {

    public TextField result;
    public TextField gold;
    public ComboBox<CharacterClass> klasse;
    public ListView<AnchorPane> zauber;
    public ListView<AnchorPane> fertigkeiten;


    public void initialize() {
        final double PLUS_FONT = 20.0;

        Label plusLabel1 = new Label("+");
        plusLabel1.setFont(new Font(PLUS_FONT));
        AnchorPane addForSkills = new AnchorPane(plusLabel1);
        fertigkeiten.getItems().add(addForSkills);
        addForSkills.setOnMouseClicked(this::skillPlusHandle);

        Label plusLabel2 = new Label("+");
        plusLabel2.setFont(new Font(PLUS_FONT));
        AnchorPane addForSpells = new AnchorPane(plusLabel2);
        zauber.getItems().add(addForSpells);
        addForSpells.setOnMouseClicked(this::spellPlusHandle);

        Initializer.initClasses(klasse.getItems());
    }

    public void removeElement(AnchorPane pane) {
        fertigkeiten.getItems().remove(pane);
        zauber.getItems().remove(pane);
    }

    private void skillPlusHandle(MouseEvent mouseEvent) {
        AnchorPane pane = null;
        try {
            //FXMLLoader.load(EXPCalculator.class.getResource("skillblock.fxml"));
            FXMLLoader loader = new FXMLLoader(EXPCalculator.class.getResource("skillblock.fxml"));
            pane = loader.load();
            BlockController blockController = loader.getController();
            blockController.giveReference(pane, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (pane != null) {
            ObservableList<AnchorPane> list = fertigkeiten.getItems();
            list.add(list.size() - 1, pane);
        }
    }

    private void spellPlusHandle(MouseEvent mouseEvent) {
        AnchorPane pane = null;
        try {
            FXMLLoader loader = new FXMLLoader(EXPCalculator.class.getResource("spellblock.fxml"));
            pane = loader.load();
            BlockController blockController = loader.getController();
            blockController.giveReference(pane, this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (pane != null) {
            ObservableList<AnchorPane> list = zauber.getItems();
            list.add(list.size() - 1, pane);
        }
    }


}
