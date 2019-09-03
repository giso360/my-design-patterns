package org.buildpat.product;

public class Pc {

	private int price;
	private String brand;
	private int ram;
	private String hdType;
	private int storageMem;
	private String os;
	private Monitor monitor;

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

	public String getBrand() {
		return brand;
	}

	public int getRam() {
		return ram;
	}

	public String getHdType() {
		return hdType;
	}

	public int getStorageMem() {
		return storageMem;
	}

	public String getOs() {
		return os;
	}

	public Monitor getMonitor() {
		return monitor;
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

}
