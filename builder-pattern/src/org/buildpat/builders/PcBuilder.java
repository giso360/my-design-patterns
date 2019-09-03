package org.buildpat.builders;

import org.buildpat.builderimpl.PcBuilderImplementation;
import org.buildpat.product.Monitor;

public interface PcBuilder {

	PcBuilderImplementation setPrice(int price);
	PcBuilderImplementation setBrand(String pcBrandName);
	PcBuilderImplementation setRamGB(int ram);
	PcBuilderImplementation setHDType(String hdType);
	PcBuilderImplementation setStorageMem(int storageMem);
	PcBuilderImplementation setOS(String os);
	PcBuilderImplementation setMonitor(Monitor monitor);

}
