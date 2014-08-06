package com.java.reference.debate;

public class ObjectPassByValue {

	public static void main(String[] args) {
		Car car = new Car("Audi");
		System.out.println("Brand of car before main method : " + car.brand);
		printBrand(car);
		System.out.println("Brand of car after main method" + car.brand);
	}

	public static void printBrand(Car car) {
		car.brand = "Volkswagen";
		System.out.println("Brand of Card inside printBrand: " + car.brand);
	}

	private static class Car {

		private String brand;

		public Car(String brand) {
			super();
			this.brand = brand;
		}

	}

}
