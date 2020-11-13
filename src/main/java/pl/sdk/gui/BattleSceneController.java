package pl.sdk.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import pl.sdk.Point;
import pl.sdk.Segment;

public class BattleSceneController {

    @FXML
    AnchorPane pane;

    @FXML
    private void initialize() {
        Point common = new Point(1, 1);
        Point end1 = new Point(1, 4);
        Point end2 = new Point(4, 1);
        common = new Point(4, 4);

        Segment segment = new Segment(common, end1, Color.BLUE);
        Segment segment1 = new Segment(common, end2);

        pane.getChildren().addAll(segment, segment1);

        segment.getStartPoint().setX(8);
        refreshGui(segment, segment1);
    }

    private void refreshGui(Segment segment, Segment segment1) {
        segment.refreshGui();
        segment1.refreshGui();
    }
}