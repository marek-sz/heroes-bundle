package pl.sdk;

import java.util.HashMap;
import java.util.Map;

class Board {
    private final Map<Point, Creature> map;

    Board() {
        map = new HashMap<>();
    }

    void add(Point point, Creature creature) {
        map.putIfAbsent(point, creature);
    }

    void moveCreature(Point startPosition, Point endPosition) {
        add(endPosition, map.get(startPosition));
        map.remove(startPosition);
    }

    Creature get(int x, int y) {
        return map.get(new Point(x, y));
    }
}
