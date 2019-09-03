package org.buildpat.builderimpl;

import org.buildpat.builders.PcBuilder;
import org.buildpat.product.Monitor;
import org.buildpat.product.Pc;

public class PcBuilderImplementation implements PcBuilder {

	private int price;
	private String brand;
	private int ram;
	private String hDType;
	private int storageMem;
	private String os;
	private Monitor monitor;

	@Override
	public PcBuilderImplementation setPrice(int price) {
		this.price = price;
		return this;
	}

	@Override
	public PcBuilderImplementation setBrand(String pcBrandName) {
		this.brand = pcBrandName;
		return this;
	}

	@Override
	public PcBuilderImplementation setRamGB(int ram) {
		this.ram = ram;
		return this;
	}

	@Override
	public PcBuilderImplementation setHDType(String hdType) {
		this.hDType = hdType;
		return this;
	}

	@Override
	public PcBuilderImplementation setStorageMem(int storageMem) {
		this.storageMem = storageMem;
		return this;
	}

	@Override
	public PcBuilderImplementation setOS(String os) {
		this.os = os;
		return this;
	}

	@Override
	public PcBuilderImplementation setMonitor(Monitor monitor) {
		this.monitor = monitor;
		return this;
	}

	public Pc build(){
		return new Pc(price, brand, ram, hDType, storageMem, os, monitor);
	}

////////////////////////////////////////////////////////////////////////////

}
