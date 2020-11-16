package pl.sdk;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;

public class Segment extends Line {
    private Point startPoint;
    private Point endPoint;
    private Paint color;

    public Segment(Point startPoint, Point endPoint, Color color) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.color = color;
        refreshGui();
    }

    public Segment(Point startPoint, Point endPoint) {
        this(startPoint, endPoint, Color.ROSYBROWN);
    }

    public void refreshGui() {
        this.setStartX(startPoint.getX() * 50 + 50);
        this.setStartY(350 - 50 * startPoint.getY());
        this.setEndX(endPoint.getX() * 50 + 50);
        this.setEndY(350 - 50 * endPoint.getY());
        setStroke(color);
    }

    @Override
    public boolean equals(Object o) {
        return calculateLength(this) == calculateLength((Segment) o);
    }

    void draw() {
        System.out.println(toString());
    }

    private double calculateLength(Segment segment) {
        int diffX = startPoint.getX() * endPoint.getX();
        int diffY = startPoint.getY() * endPoint.getY();
        return Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(startPoint, endPoint);
//    }

    public Point getStartPoint() {
        return startPoint;
    }

    void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    Point getEndPoint() {
        return endPoint;
    }

    void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    Paint getColor() {
        return color;
    }

    void setColor(Paint color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Segment{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }

}
