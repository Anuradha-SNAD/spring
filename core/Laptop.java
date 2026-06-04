package org.snad;

public class Laptop {
	 String brand;
	 int ram;
	 int rom;
	double cost;
	
	public Laptop(String brand, int ram, int rom, double cost) {
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.cost = cost;
	}
	
	public void run() {
		System.out.println("Laptop Running...");
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", rom=" + rom + ", cost=" + cost + "]";
	}

}
