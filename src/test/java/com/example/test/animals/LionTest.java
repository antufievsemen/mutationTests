package com.example.test.animals;

import com.example.animals.Lion;
import com.sun.source.tree.NewArrayTree;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LionTest {

    private Lion lion;

    @Before
    public void setUp() {
        this.lion = new Lion(100, 10);
    }

    @Test
    public void eatFoodTest() {
        this.lion.eatFood();
        Assert.assertEquals(Integer.valueOf(0), lion.getFood());
    }

    @Test
    public void getChildLion() {
        Lion childLion = this.lion.getChildOfLion();
        Assert.assertEquals(Integer.valueOf(10), childLion.getSize());
        Assert.assertEquals(Integer.valueOf(2), childLion.getFood());
    }

    @Test
    public void growUpTest() {
        Integer size = lion.getSize() * 2;
        Integer countOfFood = lion.getFood() + 2;
        this.lion.growUp();
        Assert.assertEquals(size, lion.getSize());
        Assert.assertEquals(countOfFood, lion.getFood());
    }
}
