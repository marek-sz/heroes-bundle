package pl.sdk.gui;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import pl.sdk.Point;
import pl.sdk.Segment;
import pl.sdk.ShapeRenderer;
import pl.sdk.ShapeSelfishRenderer;

import java.util.Arrays;

public class BattleSceneController {

    @FXML
    AnchorPane pane;

    @FXML
    private void initialize() {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(3, 1);
        Point point3 = new Point(3, 3);
        Point point4 = new Point(1, 3);

        ShapeRenderer shape = new ShapeRenderer(Arrays.asList(point1, point2, point3, point4));
        ShapeSelfishRenderer selfishShape = new ShapeSelfishRenderer(Arrays.asList(point1, point2, point3, point4));
        ShapeSelfishRenderer selfishShape2 = new ShapeSelfishRenderer(Arrays.asList(point2, point1, point3, point4));
        shape.draw(pane);

        selfishShape.draw(pane);
        selfishShape2.draw(pane);

        shape.getPoints().get(2).setX(5);
        pane.getChildren().stream()
                .filter(n -> n instanceof Segment)
                .map(node -> (Segment) node)
                .forEach(Segment::refreshGui);
    }

    private void refreshGui(Segment segment, Segment segment1) {
        segment.refreshGui();
        segment1.refreshGui();
    }
}