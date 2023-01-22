package com.redhat.developers;

import javax.json.bind.annotation.JsonbCreator;

public class Departure {

    private StopPoint stop_point;
    private Route route;

    Departure(StopPoint stop_point,Route route) {
        this.stop_point = stop_point;
        this.route = route;
    }

    @JsonbCreator
    public static Departure of(StopPoint stop_point, Route route) {
        return new Departure(stop_point, route);
    }


    public StopPoint getStopPoint() {
        return stop_point;
    }

    public Route getRoute() {
        return route;
    }

}
