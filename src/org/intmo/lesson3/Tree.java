package org.intmo.lesson3;

public class Tree {
    private Integer age;
    private Boolean live;
    private String name;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean live, String name) {
        this.age = age;
        this.live = live;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age=" + age +
                ", live=" + live +
                ", name='" + name + '\'' +
                '}';
    }
}
