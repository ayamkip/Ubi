package com.anjar.ContextManager;

import java.util.Timer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.anjar_ibnu.GPSBundle.GPSBundleService;

public class ContextManagerActivator implements BundleActivator {
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	ServiceReference helloServiceReference;
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
        helloServiceReference= context.getServiceReference(GPSBundleService.class.getName());
        GPSBundleService gpsBundleService =(GPSBundleService)context.getService(helloServiceReference);
        ContextManager contextManager= new ContextManager();
        GPSUpdater gpsUpdater = new GPSUpdater(gpsBundleService, contextManager);
        Timer timer = new Timer();
        timer.schedule(gpsUpdater, 0, 5000);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
        context.ungetService(helloServiceReference);
	}

}
