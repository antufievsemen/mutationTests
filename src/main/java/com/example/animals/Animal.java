package com.example.animals;

public class Animal {
    protected Integer size;
    protected Integer food;

    public Animal(Integer size, Integer food) {
        this.size = size;
        this.food = food;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }
}
