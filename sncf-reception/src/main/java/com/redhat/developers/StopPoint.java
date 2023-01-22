package com.redhat.developers;


import javax.json.bind.annotation.JsonbCreator;

public class StopPoint {

    private StopArea stop_area;

    StopPoint(StopArea stop_area) {
        this.stop_area = stop_area;
    }

    @JsonbCreator
    public static StopPoint of(StopArea stop_area) {
        return new StopPoint(stop_area);
    }


    public StopArea getStopArea() {
        return stop_area;
    }


}
