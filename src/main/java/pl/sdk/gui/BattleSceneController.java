package pl.sdk.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class BattleSceneController {

    @FXML
    AnchorPane pane;

    @FXML
    private void initialize() {
        pane.getChildren().add(new Label("a"));
    }

}
