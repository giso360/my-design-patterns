package org.buildpat.builderimpl;

import org.buildpat.builders.MonitorBuilder;
import org.buildpat.product.Monitor;

public class MonitorBuilderImplementation implements MonitorBuilder {

	private int screenSize;
	private String manufacturer;
	private int fps;
	private String powerMains;

	@Override
	public MonitorBuilderImplementation setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}

	@Override
	public MonitorBuilderImplementation setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		return this;
	}

	@Override
	public MonitorBuilderImplementation setFps(int fps) {
		this.fps = fps;
		return this;
	}

	@Override
	public MonitorBuilderImplementation setPowerMains(String powerMains) {
		this.powerMains = powerMains;
		return this;
	}

	public Monitor build(){
		return new Monitor(screenSize, manufacturer, fps, powerMains);
	}

	/////////////////////////////////////////////////////////////////////


}
