package org.buildpat;

import org.buildpat.builderimpl.MonitorBuilderImplementation;
import org.buildpat.builderimpl.PcBuilderImplementation;
import org.buildpat.director.MonitorDirector;
import org.buildpat.director.PcDirector;
import org.buildpat.product.Monitor;
import org.buildpat.product.Pc;

public class Main {

    public static void main(String[] args) {

        /**
         *
         * The project involves building a 2-level product.
         * A PC product with a Monitor component
         * ----------------------------------------------------------------------------------------------------
         * STEP #1: Create model classes with fields that match the description of products & subproducts
         * include getters and toString() - (check model package)
         * STEP #2: Create all interfaces with the appropriate setters (check builder package) - make sure that
         * the return types allow method chaining
         * STEP #3: Create Implementation classes for interfaces in step 1; Make sure to include a
         * build() method that conclude the creation of the product (check builderimpl package)
         * STEP #4: Write director Classes responsible for assigning initial values (check director package)
         * -------------------------------------------------------------------------------------------------
         *
         *  */

        PcDirector pcDirector = new PcDirector();
        MonitorDirector monitorDirector = new MonitorDirector();

        MonitorBuilderImplementation monitorBuilderImpl = new MonitorBuilderImplementation();
        PcBuilderImplementation pcBuilderImpl = new PcBuilderImplementation();

        monitorDirector.constructMonitor(monitorBuilderImpl);
        pcDirector.constructPc(pcBuilderImpl);

        Monitor monitor = monitorBuilderImpl.setManufacturer("LG").setFps(123).build();
        Pc pc = pcBuilderImpl.setPrice(1000).setStorageMem(2).setBrand("del").setMonitor(monitor).build();
        System.out.println(pc.toString());

    }

}
