package com.example.animals;

public class Lion extends Animal {

    public Lion(Integer size, Integer food) {
        super(size, food);
    }

    public void eatFood() {
        while(this.food != 0) {
            this.food--;
        }
    }

    public void growUp() {
        this.size *= 2;
        foodCalculation();
    }

    public Lion getChildOfLion() {
        return new Lion(10, 2);
    }

    public void foodCalculation() {
        this.food += 2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Lion)) {
            return false;
        }
        Lion lion = (Lion) obj;
        return this.food.equals(lion.getFood()) && this.size.equals(lion.getFood());
    }
}
