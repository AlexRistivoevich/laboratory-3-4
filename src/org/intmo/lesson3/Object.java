package org.intmo.lesson3;

public class Object {
    private String colour;
    private String title;
    private Double weight;

    public Object() {

    }

    public Object(String colour) {
        this.colour = colour;
    }

    public Object(String colour, Double weight) {
        this.colour = colour;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Object{" +
                "colour='" + colour + '\'' +
                ", title='" + title + '\'' +
                ", weight=" + weight +
                '}';
    }
}
