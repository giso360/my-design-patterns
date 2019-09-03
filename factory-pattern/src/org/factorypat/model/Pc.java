package org.factorypat.model;

public class Pc implements Product {

	private int price;

	private String brand;

	private int ram;

	private String hdType;

	private int storageMem;

	private String os;

	private Monitor monitor;

	public Pc() {
		this.price = 155;
		this.brand = "IBM";
		this.ram = 16;
		this.hdType = "Hybrid - SSD + HDD";
		this.storageMem = 2;
		this.os = "Windows 10";
		this.monitor = new Monitor();
	}

	public Pc(int price, String brand, int ram, String hdType, int storageMem, String os, Monitor monitor) {
		this.price = price;
		this.brand = brand;
		this.ram = ram;
		this.hdType = hdType;
		this.storageMem = storageMem;
		this.os = os;
		this.monitor = monitor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pc{" +
				"price=" + price +
				", brand='" + brand + '\'' +
				", ram=" + ram +
				", hdType='" + hdType + '\'' +
				", storageMem=" + storageMem +
				", os='" + os + '\'' +
				", monitor=" + monitor +
				'}';
	}

	@Override
	public String purchase() {
		return "you have purchased the following " + this.getClass().getSimpleName() + " product: " + this.toString() +
				"\nYou are allowed to pay only by card.";
	}
}
