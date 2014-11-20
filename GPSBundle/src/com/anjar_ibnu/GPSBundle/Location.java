package com.anjar_ibnu.GPSBundle;

public class Location {
	private final int DEFAULT_X = 0;
	private final int DEFAULT_Y = 1;
	private final char UNSPECIFIED_NAME = '-';
	private int x,y;
	private char name;
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
		this.name = UNSPECIFIED_NAME;
	}
	
	public void setName(char name) {
		this.name = name;
	}
	
	public char getName() {
		return name;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Location() {
		this.x = DEFAULT_X;
		this.y = DEFAULT_Y;
		this.name = UNSPECIFIED_NAME;
	}
}