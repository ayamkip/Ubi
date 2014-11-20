package com.anjar.ContextManager;

import java.util.TimerTask;

import com.anjar_ibnu.GPSBundle.GPSBundleService;
import com.anjar_ibnu.GPSBundle.Location;

public class GPSUpdater extends TimerTask{
	private GPSBundleService gpsBundleService;
	private ContextManager contextManager;
	
	public GPSUpdater(GPSBundleService gpsBundleService,
			ContextManager contextManager) {
		this.gpsBundleService = gpsBundleService;
		this.contextManager = contextManager;
	}
	
	@Override
	public void run() {
		Location loc = gpsBundleService.getCurrentLocation();
		int x = loc.getX();
		int y = loc.getY();
		while(!contextManager.isValidLocation(x, y))
		{
			loc = gpsBundleService.getCurrentLocation();
			x = loc.getX();
			y = loc.getY();
		}
		loc.setName(contextManager.getLocation(x, y));
		gpsBundleService.updateCurrentLocation(loc);
	}
}