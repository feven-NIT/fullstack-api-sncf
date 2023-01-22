package com.redhat.developers;
import javax.json.bind.annotation.JsonbCreator;

public class Route {

    private Direction direction;

    Route(Direction direction) {
        this.direction = direction;
    }

    @JsonbCreator
    public static Route of(Direction direction) {
        return new Route(direction);
    }

    public Direction getDirection() {
        return direction;
    }
}
