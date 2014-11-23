package com.anjar_ibnu.GPSBundle;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class GPSBundleActivator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	ServiceRegistration helloServiceRegistration;
	public void start(BundleContext context) throws Exception {
		GPSBundleService helloService = new GPSBundleImplementation();
        helloServiceRegistration =context.registerService(GPSBundleService.class.getName(), helloService, null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		helloServiceRegistration.unregister();
	}

}
