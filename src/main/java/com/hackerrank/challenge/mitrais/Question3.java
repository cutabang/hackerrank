package com.hackerrank.challenge.mitrais;

public class Question3 {
	
	public static void main(String[] args) {
        FoodFactory myFoods = new FoodFactory();
        Food food1 = myFoods.getFood("FastFood");
        Food food2 = myFoods.getFood("Fruit");	
        System.out.println("My name is: " + food1.getClass().getName());
        System.out.println("My name is: " + food2.getClass().getName());
        System.out.println("Our superclass is: " 
                            + food1.getClass().getSuperclass().getName());
        food1.serveFood();
        food2.serveFood();
    }

}

abstract class Food {
	abstract void serveFood() ;
}

class FastFood extends Food {

	void serveFood() {
		System.out.println("I'm serving FastFood");
	}
}

class Fruit extends Food {

	void serveFood() {
		System.out.println("I'm serving Fruit");
	}
}

class FoodFactory {
	public static final String TYPE_FAST_FOOD = "FastFood";
	public static final String TYPE_FRUIT = "Fruit";
	
    Food getFood(String type) {
    	switch (type) {
		case TYPE_FAST_FOOD:
			return new FastFood();
		case TYPE_FRUIT:
			return new Fruit();
		default:
			return null;
		}
    }
}
