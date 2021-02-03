package com.kita.first.cafe;

public class Cafe {
	public static void main(String[] args) {
		Menu menu = new Menu();
		Customer cus = new Customer();
		Barista bar = new Barista();
		
		MenuItem chosenMenu = cus.order(menu);
		Coffee c1 = bar.makeCoffee(chosenMenu);
		cus.drinkCoffee(c1);
	}
}
