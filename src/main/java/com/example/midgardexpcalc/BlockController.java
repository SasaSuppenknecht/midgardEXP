package com.example.midgardexpcalc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public abstract class BlockController {

    public Button xButton;
    private AnchorPane node;
    private MainController mainController;

    public void giveReference(AnchorPane anchorPane, MainController mainController) {
        node = anchorPane;
        this.mainController = mainController;
    }

    protected void xButtonHandler(ActionEvent actionEvent) {
        mainController.removeElement(node);
    }

    public void initialize() {
        xButton.setOnAction(this::xButtonHandler);
    }
}
