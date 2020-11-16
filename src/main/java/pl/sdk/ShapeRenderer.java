package pl.sdk;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.util.List;

public class ShapeRenderer {
    private final List<Point> points;

    public ShapeRenderer(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (int i = 0; i < points.size() - 1; i++) {
            Segment segment = new Segment(points.get(i), points.get(i + 1));
            segment.draw();
        }
        Segment segment = new Segment(points.get(points.size() - 1), points.get(0));
        segment.draw();
    }

    public void draw(AnchorPane pane) {
        for (int i = 0; i < points.size() - 1; i++) {
            Segment segment = new Segment(points.get(i), points.get(i + 1), Color.BLACK);
            pane.getChildren().add(segment);
        }
        Segment segment = new Segment(points.get(points.size() - 1), points.get(0));
        pane.getChildren().add(segment);
    }

    public List<Point> getPoints() {
        return points;
    }
}