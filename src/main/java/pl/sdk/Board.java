package pl.sdk;

import java.util.HashMap;
import java.util.Map;

class Board {
    private final Map<Point, Creature> map;
    static final int WIDTH = 20;
    static final int HEIGHT = 15;

    Board() {
        map = new HashMap<>();
    }

    void add(Point point, Creature creature) {
        throwExceptionWhenFieldIsTakenOrOutOfBounds(point);
        map.put(point, creature);
    }

    private void throwExceptionWhenFieldIsTakenOrOutOfBounds(Point point) {
        if (map.containsKey(point) || withinMapRange(point)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean withinMapRange(Point point) {
        int x = point.getX();
        int y = point.getY();
        return x < 0 || x > WIDTH
                || y < 0 || y > HEIGHT;
    }

    void moveCreature(Point startPosition, Point endPosition) {
        add(endPosition, map.get(startPosition));
        map.remove(startPosition);
    }

    Creature get(int x, int y) {
        return map.get(new Point(x, y));
    }

    Point get(Creature creature) {
        return null;
    }
}



