package com.anjar_ibnu.GPSBundle;

import java.util.Random;

public class GPSBundleImplementation implements GPSBundleService{
	Location currentLocation = new Location();
	@Override
	public Location getCurrentLocation() {
		int x = 0;
		int y = 0;
		//Mulai proses random
		Random rand = new Random();
		int temp = rand.nextInt(3);
		if(temp == 0)
		{
			if(rand.nextInt(2)==1)
			{
				x -= 1;
			}
			else
			{
				x += 1;
			}
		}
		else if(temp == 1)
		{
			if(rand.nextInt(2)==1)
			{
				y -= 1;
			}
			else
			{
				y += 1;
			}
		}
		else if(temp ==2)
		{
			if(rand.nextInt(2)==1)
			{
				x -= 1;
			}
			else
			{
				x += 1;
			}
			if(rand.nextInt(2)==1)
			{
				y -= 1;
			}
			else
			{
				y += 1;
			}
		}
		int curX = currentLocation.getX();
		int curY = currentLocation.getY();
		Location loc = new Location(curX+x, curY+y);
		return loc;
	}
	@Override
	public void updateCurrentLocation(Location loc) {
		this.currentLocation = loc;
		System.out.println("Lokasi berubah ke " + loc.getName());
	}
}