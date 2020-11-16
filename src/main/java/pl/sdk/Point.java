package pl.sdk;

import javafx.scene.shape.Line;

import java.util.Objects;

public class Point extends Line {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

        setStartX(50 * x + 50);
        setEndX(50 * x + 50);
        setStartY(350 - 50 * y);
        setEndY(350 - 50 * y);

        setStrokeWidth(5);
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    int getY() {
        return y;
    }

    int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }
}
