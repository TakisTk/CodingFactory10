package gr.aueb.cf.ch15.abstract_classes;

import gr.aueb.cf.ch14.Point;

public abstract class Animal {
    private long id;
    private String name;

    public Animal(){

    }

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    public abstract void speak();

    public abstract void eat();

    public abstract void sleep();

    public abstract void move();

}
