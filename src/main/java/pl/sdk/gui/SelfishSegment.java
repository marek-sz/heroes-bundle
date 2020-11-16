package pl.sdk.gui;

import pl.sdk.Point;
import pl.sdk.Segment;

public class SelfishSegment extends Segment {

    public SelfishSegment(Point startPoint, Point endPoint) {
        super(new Point(startPoint), new Point(endPoint));
    }
}
