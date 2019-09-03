package org.buildpat.director;

import org.buildpat.builderimpl.PcBuilderImplementation;

public class PcDirector {

	public PcBuilderImplementation constructPc(PcBuilderImplementation pcBuilder) {
		return pcBuilder.setOS("linux").
				setRamGB(16).
				setHDType("SSD");
	}

}
