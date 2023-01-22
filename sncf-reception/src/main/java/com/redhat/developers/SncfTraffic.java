package com.redhat.developers;

import java.util.List;

import javax.json.bind.annotation.JsonbCreator;


public class SncfTraffic {

    private List<Departure> departures;



    SncfTraffic(List<Departure> departures) {
        this.departures = departures;
    }

    @JsonbCreator
    public static SncfTraffic of(List<Departure> departures) {
        return new SncfTraffic(departures);
    }

    public List<Departure> getDeparture() {
        return departures;
    }


}