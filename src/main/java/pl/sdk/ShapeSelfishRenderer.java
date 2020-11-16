package pl.sdk;

import javafx.scene.layout.AnchorPane;
import pl.sdk.gui.SelfishSegment;

import java.util.List;

public class ShapeSelfishRenderer {
    private final List<Point> points;

    public ShapeSelfishRenderer(List<Point> points) {
        this.points = points;
    }

    public void draw() {
        for (int i = 0; i < points.size() - 1; i++) {
            Segment selfishSegment = new SelfishSegment(points.get(i), points.get(i + 1));
            selfishSegment.draw();
        }
        Segment selfishSegment = new Segment(points.get(points.size() - 1), points.get(0));
        selfishSegment.draw();
    }

    public void draw(AnchorPane pane) {
        for (int i = 0; i < points.size() - 1; i++) {
            Segment selfishSegment = new SelfishSegment(points.get(i), points.get(i + 1));
            pane.getChildren().add(selfishSegment);
        }
        Segment selfishSegment = new Segment(points.get(points.size() - 1), points.get(0));
        pane.getChildren().add(selfishSegment);
    }

    public List<Point> getPoints() {
        return points;
    }
}