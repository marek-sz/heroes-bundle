package pl.sdk.gui;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import pl.sdk.Point;
import pl.sdk.Segment;

public class BattleSceneController {

    @FXML
    AnchorPane pane;

    @FXML
    private void initialize() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 4);
        Point point3 = new Point(4, 1);

        Segment segment = new Segment(point1, point2, Color.BLUE);
        Segment segment1 = new SelfishSegment(point1, point3);

        pane.getChildren().addAll(segment, segment1);

        segment.getStartPoint().setX(8);
        refreshGui(segment, segment1);
    }

    private void refreshGui(Segment segment, Segment segment1) {
        segment.refreshGui();
        segment1.refreshGui();
    }
}