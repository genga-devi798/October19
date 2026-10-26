package org.fourwheeler;

public class Vehicle1 extends Vehicle {
	public void methodRun(String car) {
		System.out.println("Car is: "+car);
		super.methodRun("Moving");
	}

	public static void main(String[] args) {
		Vehicle1 v=new Vehicle1();
		v.methodRun("Running");

	}

}
