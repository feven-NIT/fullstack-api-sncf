package com.redhat.developers;

import javax.json.bind.annotation.JsonbCreator;

public class StopArea {


    private String name;

    StopArea(String name) {
        this.name = name;
    }

    @JsonbCreator
    public static StopArea of(String name) {
        return new StopArea(name);
    }


    public String getName() {
        return name;
    }


}
