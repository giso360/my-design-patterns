package org.buildpat.product;

public class Monitor {

	private int screenSize;
	private String manufacturer;
	private int fps;
	private String powerMains;

	public Monitor(int screenSize, String manufacturer, int fps, String powerMains) {
		this.screenSize = screenSize;
		this.manufacturer = manufacturer;
		this.fps = fps;
		this.powerMains = powerMains;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getFps() {
		return fps;
	}

	public String getPowerMains() {
		return powerMains;
	}

	@Override
	public String toString() {
		return "Monitor{" +
				"screenSize=" + screenSize +
				", manufacturer='" + manufacturer + '\'' +
				", fps=" + fps +
				", powerMains='" + powerMains + '\'' +
				'}';
	}

}
