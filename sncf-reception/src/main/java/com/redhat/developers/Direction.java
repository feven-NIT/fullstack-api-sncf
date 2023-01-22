package com.redhat.developers;
import javax.json.bind.annotation.JsonbCreator;

public class Direction {

    private String name;

    Direction(String name) {
        this.name = name;
    }

    @JsonbCreator
    public static Direction of(String name) {
        return new Direction(name);
    }

    public String getName() {
        return name;
    }

}
