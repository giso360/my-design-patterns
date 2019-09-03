package org.buildpat.director;

import org.buildpat.builderimpl.MonitorBuilderImplementation;

public class MonitorDirector {

	public MonitorBuilderImplementation constructMonitor(MonitorBuilderImplementation monitorBuilder) {
		return monitorBuilder.setScreenSize(12).
				setPowerMains("EU AC/DC");
	}

}
