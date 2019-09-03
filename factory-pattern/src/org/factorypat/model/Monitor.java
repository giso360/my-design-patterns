package org.factorypat.model;

public class Monitor implements Product{

	private int screenSize;

	private String manufacturer;

	private int fps;

	private String powerMains;

	public Monitor() {
		this.screenSize = 22;
		this.manufacturer = "Sony";
		this.fps = 12;
		this.powerMains = "EU - AC/DC";
	}

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

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setFps(int fps) {
		this.fps = fps;
	}

	public void setPowerMains(String powerMains) {
		this.powerMains = powerMains;
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

	@Override
	public String purchase() {
		return "you have purchased the following " + this.getClass().getSimpleName() + " product: " + this.toString() +
				"\nYou are allowed to pay by card or cash";
	}
}