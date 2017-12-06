package com.crunchify.model;

import java.util.ArrayList;


public class Region {
	public Region() {
		super();
	}

	boolean                  enabled;
	int                      identifier;
	String                   name;
	ArrayList<GeoCoordinate> points;

	public Region(boolean enabled, int identifier, String name,
	        ArrayList<GeoCoordinate> points) {
		super();
		this.enabled = enabled;
		this.identifier = identifier;
		this.name = name;
		this.points = points;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<GeoCoordinate> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<GeoCoordinate> points) {
		this.points = points;
	}
}
