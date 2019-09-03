package org.buildpat.builders;

import org.buildpat.builderimpl.MonitorBuilderImplementation;

public interface MonitorBuilder {

	MonitorBuilderImplementation setScreenSize(int screenSize);
	MonitorBuilderImplementation setManufacturer(String manufacturer);
	MonitorBuilderImplementation setFps(int fps);
	MonitorBuilderImplementation setPowerMains(String powerMains);

}
