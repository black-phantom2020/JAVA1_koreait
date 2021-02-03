package com.kita.first.cafe;

public class Barista {
	public Coffee makeCoffee(MenuItem mi) {
		Coffee coffee = new Coffee(mi);
		return coffee;
	}
}
